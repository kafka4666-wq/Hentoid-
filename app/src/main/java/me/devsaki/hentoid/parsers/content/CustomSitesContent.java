package me.devsaki.hentoid.parsers.content;

import androidx.annotation.NonNull;
import me.devsaki.hentoid.database.domains.Content;
import me.devsaki.hentoid.enums.Site;
import me.devsaki.hentoid.enums.StatusContent;
import me.devsaki.hentoid.parsers.ParseHelper;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class CustomSitesContent extends BaseContentParser {
    @Override
    protected Content toContent(@NonNull Document doc, @NonNull String url, boolean updateImages) {
        Content content = new Content();
        Site currentSite = Site.Companion.searchByUrl(url);
        content.setSite(currentSite != null ? currentSite : Site.NONE);
        content.setUrl(url);

        // Universal title fallback parsing
        Element titleElement = doc.selectFirst("h1, .title, .entry-title");
        if (titleElement != null) {
            content.setTitle(titleElement.text().trim());
        } else {
            content.setTitle("Custom Gallery");
        }

        // Universal cover image fallback parsing
        Element coverElement = doc.selectFirst("img[src*='cover'], #cover img, .manga-cover img");
        if (coverElement != null) {
            content.setCoverImageUrl(coverElement.attr("abs:src"));
        }

        content.setStatus(StatusContent.SAVED);
        return content;
    }
}
