package defpackage;

import android.view.ViewStructure;
import org.chromium.content.browser.accessibility.ViewStructureBuilder;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class K82 extends ViewStructureBuilder {
    public K82(C6600jN2 c6600jN2) {
        super(c6600jN2);
    }

    @Override // org.chromium.content.browser.accessibility.ViewStructureBuilder
    public final void setViewStructureNodeHtmlInfo(ViewStructure viewStructure, String str, String str2, String[][] strArr) {
        ViewStructure.HtmlInfo.Builder newHtmlInfoBuilder;
        ViewStructure.HtmlInfo build;
        super.setViewStructureNodeHtmlInfo(viewStructure, str, str2, strArr);
        newHtmlInfoBuilder = viewStructure.newHtmlInfoBuilder(str);
        if (newHtmlInfoBuilder != null) {
            newHtmlInfoBuilder.addAttribute("display", str2);
            for (String[] strArr2 : strArr) {
                newHtmlInfoBuilder.addAttribute(strArr2[0], strArr2[1]);
            }
            build = newHtmlInfoBuilder.build();
            viewStructure.setHtmlInfo(build);
        }
    }
}
