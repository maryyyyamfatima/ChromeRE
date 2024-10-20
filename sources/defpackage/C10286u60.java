package defpackage;

import J.N;
import android.app.Activity;
import android.text.SpannableString;
import android.text.TextUtils;
import com.android.chrome.R;
import org.chromium.chrome.browser.contextmenu.ContextMenuNativeDelegateImpl;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.embedder_support.contextmenu.ContextMenuParams;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: u60 */
/* loaded from: classes.dex */
public final class C10286u60 {
    public final PropertyModel a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.text.SpannableString, android.text.Spannable] */
    public C10286u60(Activity activity, int i, ContextMenuParams contextMenuParams, Profile profile, ContextMenuNativeDelegateImpl contextMenuNativeDelegateImpl) {
        String str;
        boolean M6bsIDpc;
        String c = L60.c(contextMenuParams);
        String i2 = contextMenuParams.a().i();
        if (TextUtils.isEmpty(i2)) {
            str = i2;
        } else {
            boolean z = !AbstractC3899bX.e(activity);
            GURL gurl = contextMenuParams.c;
            ?? spannableString = new SpannableString(!GN.j(gurl) ? N.MeroQv$e(gurl.i()) : "");
            C11055wM c11055wM = new C11055wM(profile);
            AbstractC11140wc2.a(spannableString, activity, c11055wM, 0, false, z, false);
            c11055wM.a();
            str = spannableString;
        }
        boolean a = L60.a();
        int M0MXVnOj = N.M0MXVnOj("TouchDragAndContextMenu", "hide_header_image", -1);
        if (M0MXVnOj != -1) {
            M6bsIDpc = M0MXVnOj != 0;
        } else {
            C7928nE c7928nE = UN.a;
            M6bsIDpc = N.M6bsIDpc("ContextMenuPopupStyle", "hide_header_image", false);
        }
        int i3 = a ? R.dimen.0_resource_name_obfuscated_res_0x7f080146 : R.dimen.0_resource_name_obfuscated_res_0x7f08013f;
        BD2 bd2 = new BD2(AbstractC11658y60.n);
        bd2.e(AbstractC11658y60.a, c);
        bd2.c(AbstractC11658y60.b, TextUtils.isEmpty(str) ? 2 : 1);
        bd2.e(AbstractC11658y60.c, str);
        bd2.c(AbstractC11658y60.e, TextUtils.isEmpty(c) ? 2 : 1);
        bd2.c(AbstractC11658y60.h, 0);
        bd2.e(AbstractC11658y60.f, null);
        bd2.b(AbstractC11658y60.g, false);
        bd2.b(AbstractC11658y60.i, M6bsIDpc);
        bd2.c(AbstractC11658y60.j, activity.getResources().getDimensionPixelSize(i3));
        PropertyModel a2 = bd2.a();
        ND2 nd2 = AbstractC11658y60.m;
        ND2 nd22 = AbstractC11658y60.l;
        ND2 nd23 = AbstractC11658y60.k;
        if (a) {
            int dimensionPixelSize = activity.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080145);
            a2.m(nd23, dimensionPixelSize);
            a2.m(nd22, dimensionPixelSize);
            a2.m(nd2, 0);
        } else {
            a2.m(nd23, -1);
            a2.m(nd22, -1);
            a2.m(nd2, -1);
        }
        this.a = a2;
        new ViewOnClickListenerC11315x60(activity, a2, i, contextMenuParams, profile, contextMenuNativeDelegateImpl);
    }
}
