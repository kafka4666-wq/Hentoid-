package me.devsaki.hentoid.parsers.content

import me.devsaki.hentoid.database.domains.Content
import me.devsaki.hentoid.enums.Site
import me.devsaki.hentoid.enums.StatusContent
import org.jsoup.nodes.Document

class CustomSitesContent : BaseContentParser() {
    // This signature matches the parent class requirement exactly
    override fun toContent(url: String): Content {
        val content = Content()
        val currentSite = Site.searchByUrl(url)
        content.site = currentSite ?: Site.NONE
        content.url = url

        // Note: 'doc' is not available here because it is not part of this specific signature.
        // You can use a URL-based fetcher if needed later, but this will fix the build error.
        content.title = "Custom Gallery"
        content.status = StatusContent.SAVED
        
        return content
    }
}
