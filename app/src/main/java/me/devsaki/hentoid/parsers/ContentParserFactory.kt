            object ContentParserFactory {

    fun getContentParserClass(site: Site): Class<out ContentParser> {
        return when (site) {
            Site.NHENTAI -> NhentaiContent::class.java
            Site.ASMHENTAI, Site.ASMHENTAI_COMICS -> ASMHentaiContent::class.java
            Site.HITOMI -> HitomiContent::class.java
            Site.TSUMINO -> TsuminoContent::class.java
            Site.PURURIN -> PururinContent::class.java
            Site.MUSES -> MusesContent::class.java
            Site.DOUJINS -> DoujinsContent::class.java
            Site.PORNCOMIX -> PorncomixContent::class.java
            Site.HENTAI2READ -> Hentai2ReadContent::class.java
            Site.HENTAIFOX -> HentaifoxContent::class.java
            Site.MRM -> MrmContent::class.java
            Site.MANHWA -> ManhwaContent::class.java
            Site.IMHENTAI -> ImhentaiContent::class.java
            Site.EHENTAI -> EhentaiContent::class.java
            Site.EXHENTAI -> ExhentaiContent::class.java
            Site.LUSCIOUS -> LusciousContent::class.java
            Site.TOONILY -> ToonilyContent::class.java
            Site.ALLPORNCOMIC -> AllPornComicContent::class.java
            Site.PIXIV -> PixivContent::class.java
            Site.MANHWA18 -> Manhwa18Content::class.java
            Site.MULTPORN -> MultpornContent::class.java
            Site.SIMPLY -> SimplyContent::class.java
            Site.HDPORNCOMICS -> HdPornComicsContent::class.java
            Site.DEVIANTART -> DeviantArtContent::class.java
            Site.MANGAGO -> MangagoContent::class.java
            Site.HIPERDEX -> HiperdexContent::class.java
            Site.NOVELCROW -> NovelcrowContent::class.java
            Site.TMO -> TmoContent::class.java
            Site.KEMONO -> KemonoContent::class.java
            Site.EROMANGA -> EromangaContent::class.java
            Site.YIFFER -> YifferContent::class.java
            
            // Your new sites mapped to DummyContent to satisfy the compiler
            Site.HENTAIHERE, Site.HENTAIERA, Site.HENTAIENVY -> DummyContent::class.java

            else -> DummyContent::class.java
        }
    }

    fun getImageListParser(site: Site): ImageListParser {
        return when (site) {
            Site.ASMHENTAI, Site.ASMHENTAI_COMICS -> ASMHentaiParser()
            Site.HITOMI -> HitomiParser()
            Site.TSUMINO -> TsuminoParser()
            Site.PURURIN -> PururinParser()
            Site.EHENTAI -> EHentaiParser()
            Site.EXHENTAI -> ExHentaiParser()
            Site.LUSCIOUS -> LusciousParser()
            Site.PORNCOMIX -> PorncomixParser()
            Site.MUSES -> MusesParser()
            Site.NHENTAI -> NhentaiParser()
            Site.DOUJINS -> DoujinsParser()
            Site.HENTAI2READ -> Hentai2ReadParser()
            Site.HENTAIFOX -> HentaifoxParser()
            Site.MRM -> MrmParser()
            Site.MANHWA -> ManhwaParser()
            Site.IMHENTAI -> ImhentaiParser()
            Site.TOONILY -> ToonilyParser()
            Site.ALLPORNCOMIC -> AllPornComicParser()
            Site.PIXIV -> PixivParser()
            Site.MANHWA18 -> Manhwa18Parser()
            Site.MULTPORN -> MultpornParser()
            Site.SIMPLY -> SimplyParser()
            Site.HDPORNCOMICS -> HdPornComicsParser()
            Site.DEVIANTART -> DeviantArtParser()
            Site.MANGAGO -> MangagoParser()
            Site.HIPERDEX -> HiperdexParser()
            Site.NOVELCROW -> NovelcrowParser()
            Site.TMO -> TmoParser()
            Site.KEMONO -> KemonoParser()
            Site.EROMANGA -> EromangaParser()
            Site.YIFFER -> YifferParser()
            
            // Your new sites mapped to DummyParser
            Site.HENTAIHERE, Site.HENTAIERA, Site.HENTAIENVY -> DummyParser()

            else -> DummyParser()
        }
    }
            }
            
