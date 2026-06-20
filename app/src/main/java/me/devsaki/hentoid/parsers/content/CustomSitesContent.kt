package me.devsaki.hentoid.parsers.content

import me.devsaki.hentoid.database.domains.Content
import me.devsaki.hentoid.enums.Site
import me.devsaki.hentoid.enums.StatusContent

class CustomSitesContent : BaseContentParser() {
    
    override fun toContent(url: String): Content {
        val content = Content()
        content.site = Site.searchByUrl(url) ?: Site.NONE
        content.url = url
        content.title = "Custom Gallery"
        content.status = StatusContent.SAVED
        return content
    }

    override fun update(content: Content, url: String, updateImages: Boolean): Content {
        return content
    }
}
