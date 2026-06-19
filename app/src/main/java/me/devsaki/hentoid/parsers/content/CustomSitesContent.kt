package me.devsaki.hentoid.parsers.content

import me.devsaki.hentoid.database.domains.Content
import me.devsaki.hentoid.enums.Site
import me.devsaki.hentoid.enums.StatusContent
import org.jsoup.nodes.Document

class CustomSitesContent : BaseContentParser() {
    // Corrected override signature to include the 'pg' (page) parameter
    override fun toContent(doc: Document, url: String, updateImages: Boolean, pg: Int): Content {
        val content = Content()
        val currentSite = Site.searchByUrl(url)
        content.site = currentSite ?: Site.NONE
        content.url = url

        // Universal title fallback
        val titleElement = doc.selectFirst("h1, .title, .entry-title")
        content.title = titleElement?.text()?.trim() ?: "Custom Gallery"

        // Universal cover image fallback
        val coverElement = doc.selectFirst("img[src*='cover'], #cover img, .manga-cover img")
        if (coverElement != null) {
            content.coverImageUrl = coverElement.attr("abs:src")
        }

        content.status = StatusContent.SAVED
        return content
    }
}
