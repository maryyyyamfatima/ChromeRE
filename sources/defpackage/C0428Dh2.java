package defpackage;

import J.N;
import android.content.Context;
import android.view.View;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.commerce.core.ShoppingService;
import org.chromium.components.page_info.PageInfoController;
import org.chromium.components.page_info.PageInfoRowView;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Dh2 */
/* loaded from: classes.dex */
public final class C0428Dh2 implements InterfaceC0558Eh2 {
    public static final int n = View.generateViewId();
    public final InterfaceC0079Ap3 a;
    public final InterfaceC10141th2 g;
    public final PageInfoRowView h;
    public final Context i;
    public final boolean j;
    public final WebContents k;
    public final C8083nh2 l = new C8083nh2();
    public final WT1 m = new WT1();

    @Override // defpackage.InterfaceC0558Eh2
    public final void a() {
    }

    @Override // defpackage.InterfaceC0558Eh2
    public final String b() {
        return "";
    }

    @Override // defpackage.InterfaceC0558Eh2
    public final View d(C0813Gg2 c0813Gg2) {
        return null;
    }

    @Override // defpackage.InterfaceC0558Eh2
    public final void f() {
    }

    @Override // defpackage.InterfaceC0558Eh2
    public final void g() {
    }

    public C0428Dh2(InterfaceC10141th2 interfaceC10141th2, PageInfoRowView pageInfoRowView, InterfaceC0079Ap3 interfaceC0079Ap3, boolean z, WebContents webContents, Profile profile) {
        this.g = interfaceC10141th2;
        this.h = pageInfoRowView;
        this.i = pageInfoRowView.getContext();
        this.a = interfaceC0079Ap3;
        this.j = z;
        this.k = webContents;
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("CommerceMerchantViewer")) {
            new C5260fU1().a(new Callback() { // from class: Ah2
                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    C0428Dh2.this.c((ShoppingService.MerchantInfo) obj);
                }

                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }
            }, profile, ((PageInfoController) interfaceC10141th2).n);
            return;
        }
        c(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:            if (r2 != null) goto L121;     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(final org.chromium.components.commerce.core.ShoppingService.MerchantInfo r7) {
        /*
            r6 = this;
            zh2 r0 = new zh2
            r0.<init>()
            WT1 r1 = r6.m
            Ap3 r2 = r6.a
            if (r2 == 0) goto L6c
            java.lang.Object r2 = r2.get()
            if (r2 == 0) goto L6c
            if (r7 != 0) goto L14
            goto L6c
        L14:
            r2 = 1
            r0.a = r2
            android.content.Context r3 = r6.i
            android.content.res.Resources r4 = r3.getResources()
            r5 = 2132019059(0x7f140773, float:1.9676442E38)
            java.lang.String r4 = r4.getString(r5)
            r0.d = r4
            float r4 = r7.a
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L34
            android.text.SpannableStringBuilder r2 = defpackage.VT1.a(r3, r7, r2)
            if (r2 == 0) goto L44
            goto L46
        L34:
            boolean r2 = r7.d
            if (r2 == 0) goto L44
            android.content.res.Resources r2 = r3.getResources()
            r3 = 2132019057(0x7f140771, float:1.9676438E38)
            java.lang.String r2 = r2.getString(r3)
            goto L46
        L44:
            java.lang.String r2 = ""
        L46:
            r0.e = r2
            r2 = 2131297060(0x7f090324, float:1.8212054E38)
            r0.b = r2
            boolean r2 = r6.j
            if (r2 == 0) goto L56
            r2 = 2131166642(0x7f0705b2, float:1.7947535E38)
            r0.i = r2
        L56:
            Bh2 r2 = new Bh2
            r2.<init>()
            r0.f = r2
            r1.getClass()
            org.chromium.content_public.browser.WebContents r7 = r6.k
            if (r7 == 0) goto L6f
            java.lang.String r2 = "Shopping.MerchantTrust.RowSeen"
            java.lang.String r3 = "HasOccurred"
            J.N.M$ejnyHh(r7, r2, r3)
            goto L6f
        L6c:
            r7 = 0
            r0.a = r7
        L6f:
            boolean r7 = r0.a
            r1.getClass()
            java.lang.String r1 = "MerchantTrust.PageInfo.IsStoreInfoVisible"
            defpackage.EI2.b(r1, r7)
            org.chromium.components.page_info.PageInfoRowView r7 = r6.h
            r7.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0428Dh2.c(org.chromium.components.commerce.core.ShoppingService$MerchantInfo):void");
    }
}
