package defpackage;

import java.util.Arrays;
import java.util.HashSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Zh0 */
/* loaded from: classes.dex */
public abstract class AbstractC3285Zh0 {
    public static final HashSet a = new HashSet(Arrays.asList("delegate", "feedPrefetcher", "parentFeedContextChain", "child", "children", "childComponent", "trackingCode", "eventsController", "itemAnimator", "onScrollListeners", "recyclerConfiguration", "threadTileViewData", "textColorStateList", "typeface", "text", "params"));

    public static void addViewDescription(C3025Xh0 c3025Xh0, StringBuilder sb, int i, int i2, boolean z, boolean z2) {
        addViewDescription(c3025Xh0, sb, i, i2, z, z2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void addViewDescription(defpackage.C3025Xh0 r9, java.lang.StringBuilder r10, int r11, int r12, boolean r13, boolean r14, defpackage.InterfaceC3155Yh0 r15) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC3285Zh0.addViewDescription(Xh0, java.lang.StringBuilder, int, int, boolean, boolean, Yh0):void");
    }

    public static String a(int i, Object obj) {
        if (obj == null) {
            return "";
        }
        String replace = obj.toString().replace(" \n", " ").replace("\n", " ").replace("\"", "");
        return replace.length() > i ? AbstractC7848n0.a(replace.substring(0, i), "...") : replace;
    }
}
