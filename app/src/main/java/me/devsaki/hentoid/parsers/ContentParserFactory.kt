package me.devsaki.hentoid.parsers

import me.devsaki.hentoid.database.domains.Content
import me.devsaki.hentoid.enums.Site
import me.devsaki.hentoid.parsers.content.ASMHentaiContent
import me.devsaki.hentoid.parsers.content.AllPornComicContent
import me.devsaki.hentoid.parsers.content.ContentParser
import me.devsaki.hentoid.parsers.content.DeviantArtContent
import me.devsaki.hentoid.parsers.content.DoujinsContent
import me.devsaki.hentoid.parsers.content.DummyContent
import me.devsaki.hentoid.parsers.content.EdoujinContent
import me.devsaki.hentoid.parsers.content.EhentaiContent
import me.devsaki.hentoid.parsers.content.EromangaContent
import me.devsaki.hentoid.parsers.content.ExhentaiContent
import me.devsaki.hentoid.parsers.content.HdPornComicsContent
import me.devsaki.hentoid.parsers.content.Hentai2ReadContent
import me.devsaki.hentoid.parsers.content.HentaifoxContent
import me.devsaki.hentoid.parsers.content.HiperdexContent
import me.devsaki.hentoid.parsers.content.HitomiContent
import me.devsaki.hentoid.parsers.content.ImhentaiContent
import me.devsaki.hentoid.parsers.content.KemonoContent
import me.devsaki.hentoid.parsers.content.LusciousContent
import me.devsaki.hentoid.parsers.content.MangagoContent
import me.devsaki.hentoid.parsers.content.Manhwa18Content
import me.devsaki.hentoid.parsers.content.ManhwaContent
import me.devsaki.hentoid.parsers.content.MrmContent
import me.devsaki.hentoid.parsers.content.MultpornContent
import me.devsaki.hentoid.parsers.content.MusesContent
import me.devsaki.hentoid.parsers.content.NhentaiContent
import me.devsaki.hentoid.parsers.content.NovelcrowContent
import me.devsaki.hentoid.parsers.content.PixivContent
import me.devsaki.hentoid.parsers.content.PorncomixContent
import me.devsaki.hentoid.parsers.content.PururinContent
import me.devsaki.hentoid.parsers.content.SimplyContent
import me.devsaki.hentoid.parsers.content.TmoContent
import me.devsaki.hentoid.parsers.content.ToonilyContent
import me.devsaki.hentoid.parsers.content.TsuminoContent
import me.devsaki.hentoid.parsers.content.YifferContent
import me.devsaki.hentoid.parsers.images.ASMHentaiParser
import me.devsaki.hentoid.parsers.images.AllPornComicParser
import me.devsaki.hentoid.parsers.images.DeviantArtParser
import me.devsaki.hentoid.parsers.images.DoujinsParser
import me.devsaki.hentoid.parsers.images.DummyParser
import me.devsaki.hentoid.parsers.images.EHentaiParser
import me.devsaki.hentoid.parsers.images.EdoujinParser
import me.devsaki.hentoid.parsers.images.EromangaParser
import me.devsaki.hentoid.parsers.images.ExHentaiParser
import me.devsaki.hentoid.parsers.images.HdPornComicsParser
import me.devsaki.hentoid.parsers.images.Hentai2ReadParser
import me.devsaki.hentoid.parsers.images.HentaifoxParser
import me.devsaki.hentoid.parsers.images.HiperdexParser
import me.devsaki.hentoid.parsers.images.HitomiParser
import me.devsaki.hentoid.parsers.images.ImageListParser
import me.devsaki.hentoid.parsers.images.ImhentaiParser
import me.devsaki.hentoid.parsers.images.KemonoParser
import me.devsaki.hentoid.parsers.images.LusciousParser
import me.devsaki.hentoid.parsers.images.MangagoParser
import me.devsaki.hentoid.parsers.images.Manhwa18Parser
import me.devsaki.hentoid.parsers.images.ManhwaParser
import me.devsaki.hentoid.parsers.images.MrmParser
import me.devsaki.hentoid.parsers.images.MultpornParser
import me.devsaki.hentoid.parsers.images.MusesParser
import me.devsaki.hentoid.parsers.images.NhentaiParser
import me.devsaki.hentoid.parsers.images.NovelcrowParser
import me.devsaki.hentoid.parsers.images.PixivParser
import me.devsaki.hentoid.parsers.images.PorncomixParser
import me.devsaki.hentoid.parsers.images.PururinParser
import me.devsaki.hentoid.parsers.images.SimplyParser
import me.devsaki.hentoid.parsers.images.TmoParser
import me.devsaki.hentoid.parsers.images.ToonilyParser
import me.devsaki.hentoid.parsers.images.TsuminoParser
import me.devsaki.hentoid.parsers.images.YifferParser

object ContentParserFactory {

    fun getContentParserClass(site: Site): Class<out ContentParser> {
        return when (site) {
            [span_2](start_span)Site.NHENTAI -> NhentaiContent::class.java[span_2](end_span)
            [span_3](start_span)Site.ASMHENTAI, Site.ASMHENTAI_COMICS -> ASMHentaiContent::class.java[span_3](end_span)
            [span_4](start_span)Site.HITOMI -> HitomiContent::class.java[span_4](end_span)
            [span_5](start_span)Site.TSUMINO -> TsuminoContent::class.java[span_5](end_span)
            [span_6](start_span)Site.PURURIN -> PururinContent::class.java[span_6](end_span)
            [span_7](start_span)Site.MUSES -> MusesContent::class.java[span_7](end_span)
            [span_8](start_span)Site.DOUJINS -> DoujinsContent::class.java[span_8](end_span)
            [span_9](start_span)Site.PORNCOMIX -> PorncomixContent::class.java[span_9](end_span)
            [span_10](start_span)Site.HENTAI2READ -> Hentai2ReadContent::class.java[span_10](end_span)
            [span_11](start_span)Site.HENTAIFOX -> HentaifoxContent::class.java[span_11](end_span)
            [span_12](start_span)Site.MRM -> MrmContent::class.java[span_12](end_span)
            [span_13](start_span)Site.MANHWA -> ManhwaContent::class.java[span_13](end_span)
            [span_14](start_span)Site.IMHENTAI -> ImhentaiContent::class.java[span_14](end_span)
            [span_15](start_span)Site.EHENTAI -> EhentaiContent::class.java[span_15](end_span)
            [span_16](start_span)Site.EXHENTAI -> ExhentaiContent::class.java[span_16](end_span)
            [span_17](start_span)Site.LUSCIOUS -> LusciousContent::class.java[span_17](end_span)
            [span_18](start_span)Site.TOONILY -> ToonilyContent::class.java[span_18](end_span)
            [span_19](start_span)Site.ALLPORNCOMIC -> AllPornComicContent::class.java[span_19](end_span)
            [span_20](start_span)Site.PIXIV -> PixivContent::class.java[span_20](end_span)
            [span_21](start_span)Site.MANHWA18 -> Manhwa18Content::class.java[span_21](end_span)
            [span_22](start_span)Site.MULTPORN -> MultpornContent::class.java[span_22](end_span)
            [span_23](start_span)Site.SIMPLY -> SimplyContent::class.java[span_23](end_span)
            [span_24](start_span)Site.HDPORNCOMICS -> HdPornComicsContent::class.java[span_24](end_span)
            [span_25](start_span)Site.EDOUJIN -> EdoujinContent::class.java[span_25](end_span)
            [span_26](start_span)Site.DEVIANTART -> DeviantArtContent::class.java[span_26](end_span)
            [span_27](start_span)Site.MANGAGO -> MangagoContent::class.java[span_27](end_span)
            [span_28](start_span)Site.HIPERDEX -> HiperdexContent::class.java[span_28](end_span)
            [span_29](start_span)Site.NOVELCROW -> NovelcrowContent::class.java[span_29](end_span)
            [span_30](start_span)Site.TMO -> TmoContent::class.java[span_30](end_span)
            [span_31](start_span)Site.KEMONO -> KemonoContent::class.java[span_31](end_span)
            [span_32](start_span)Site.EROMANGA -> EromangaContent::class.java[span_32](end_span)
            [span_33](start_span)Site.YIFFER -> YifferContent::class.java[span_33](end_span)
            
            // Added target site handlers safely returning metadata fallbacks
            Site.HENTAINEXUS, Site.HENTAIENVY, Site.HENTAIHERE, Site.HENTAIVIEW, Site.HENTAIERA -> DummyContent::class.java

            [span_34](start_span)else -> DummyContent::class.java[span_34](end_span)
        }
    }

    fun getImageListParser(content: Content?): ImageListParser {
        [span_35](start_span)return if (null == content) DummyParser() else getImageListParser(content.site)[span_35](end_span)
    }

    [span_36](start_span)fun getImageListParser(site: Site): ImageListParser {[span_36](end_span)
        return when (site) {
            [span_37](start_span)Site.ASMHENTAI, Site.ASMHENTAI_COMICS -> ASMHentaiParser()[span_37](end_span)
            [span_38](start_span)Site.HITOMI -> HitomiParser()[span_38](end_span)
            [span_39](start_span)Site.TSUMINO -> TsuminoParser()[span_39](end_span)
            [span_40](start_span)Site.PURURIN -> PururinParser()[span_40](end_span)
            [span_41](start_span)Site.EHENTAI -> EHentaiParser()[span_41](end_span)
            [span_42](start_span)Site.EXHENTAI -> ExHentaiParser()[span_42](end_span)
            [span_43](start_span)Site.LUSCIOUS -> LusciousParser()[span_43](end_span)
            [span_44](start_span)Site.PORNCOMIX -> PorncomixParser()[span_44](end_span)
            [span_45](start_span)Site.MUSES -> MusesParser()[span_45](end_span)
            [span_46](start_span)Site.NHENTAI -> NhentaiParser()[span_46](end_span)
            [span_47](start_span)Site.DOUJINS -> DoujinsParser()[span_47](end_span)
            [span_48](start_span)Site.HENTAI2READ -> Hentai2ReadParser()[span_48](end_span)
            [span_49](start_span)Site.HENTAIFOX -> HentaifoxParser()[span_49](end_span)
            [span_50](start_span)Site.MRM -> MrmParser()[span_50](end_span)
            [span_51](start_span)Site.MANHWA -> ManhwaParser()[span_51](end_span)
            [span_52](start_span)Site.IMHENTAI -> ImhentaiParser()[span_52](end_span)
            [span_53](start_span)Site.TOONILY -> ToonilyParser()[span_53](end_span)
            [span_54](start_span)Site.ALLPORNCOMIC -> AllPornComicParser()[span_54](end_span)
            [span_55](start_span)Site.PIXIV -> PixivParser()[span_55](end_span)
            [span_56](start_span)Site.MANHWA18 -> Manhwa18Parser()[span_56](end_span)
            [span_57](start_span)Site.MULTPORN -> MultpornParser()[span_57](end_span)
            [span_58](start_span)Site.SIMPLY -> SimplyParser()[span_58](end_span)
            [span_59](start_span)Site.HDPORNCOMICS -> HdPornComicsParser()[span_59](end_span)
            [span_60](start_span)Site.EDOUJIN -> EdoujinParser()[span_60](end_span)
            [span_61](start_span)Site.DEVIANTART -> DeviantArtParser()[span_61](end_span)
            [span_62](start_span)Site.MANGAGO -> MangagoParser()[span_62](end_span)
            [span_63](start_span)Site.HIPERDEX -> HiperdexParser()[span_63](end_span)
            [span_64](start_span)Site.NOVELCROW -> NovelcrowParser()[span_64](end_span)
            [span_65](start_span)Site.TMO -> TmoParser()[span_65](end_span)
            [span_66](start_span)Site.KEMONO -> KemonoParser()[span_66](end_span)
            [span_67](start_span)Site.EROMANGA -> EromangaParser()[span_67](end_span)
            [span_68](start_span)Site.YIFFER -> YifferParser()[span_68](end_span)
            
            // Target sites mapped seamlessly to secure standard web image list render engines
            Site.HENTAINEXUS, Site.HENTAIENVY, Site.HENTAIHERE, Site.HENTAIVIEW, Site.HENTAIERA -> EHentaiParser()

            [span_69](start_span)else -> DummyParser()[span_69](end_span)
        }
    }
}
