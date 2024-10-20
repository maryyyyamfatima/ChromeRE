package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: g33 */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5464g33 {
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:            if (android.provider.Settings.Global.getInt(r1.getContentResolver(), "device_provisioned", 0) != 0) goto L79;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.chromium.content.browser.selection.SmartSelectionClient a(org.chromium.content_public.browser.WebContents r4) {
        /*
            org.chromium.content.browser.selection.SelectionPopupControllerImpl r0 = org.chromium.content.browser.selection.SelectionPopupControllerImpl.k(r4)
            v33 r0 = r0.n
            org.chromium.ui.base.WindowAndroid r1 = r4.Q0()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r2 < r3) goto L41
            if (r1 != 0) goto L13
            goto L41
        L13:
            Oi1 r1 = r1.j
            java.lang.Object r1 = r1.get()
            android.content.Context r1 = (android.content.Context) r1
            if (r1 == 0) goto L31
            android.content.ContentResolver r2 = r1.getContentResolver()
            if (r2 != 0) goto L24
            goto L31
        L24:
            android.content.ContentResolver r1 = r1.getContentResolver()
            java.lang.String r2 = "device_provisioned"
            r3 = 0
            int r1 = android.provider.Settings.Global.getInt(r1, r2, r3)
            if (r1 == 0) goto L32
        L31:
            r3 = 1
        L32:
            if (r3 == 0) goto L41
            boolean r1 = r4.isIncognito()
            if (r1 == 0) goto L3b
            goto L41
        L3b:
            org.chromium.content.browser.selection.SmartSelectionClient r1 = new org.chromium.content.browser.selection.SmartSelectionClient
            r1.<init>(r0, r4)
            goto L42
        L41:
            r1 = 0
        L42:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC5464g33.a(org.chromium.content_public.browser.WebContents):org.chromium.content.browser.selection.SmartSelectionClient");
    }
}
