package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import java.util.List;
import java.util.regex.Pattern;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zd0 */
/* loaded from: classes.dex */
public final class C12173zd0 extends C5877hG0 {
    public final String c;
    public final C4502dG0 d;
    public final B84 e;

    public C12173zd0(TabImpl tabImpl, C4502dG0 c4502dG0, B84 b84) {
        super(tabImpl);
        this.c = C1663Mu3.e(tabImpl).g;
        this.d = c4502dG0;
        this.e = b84;
    }

    @Override // defpackage.C5877hG0, defpackage.InterfaceC5189fG0
    public final boolean b(Intent intent, C11026wG0 c11026wG0) {
        String str = this.c;
        if (TextUtils.isEmpty(str) || !(!C12055zG0.d(str, (List) c11026wG0.get(), false).isEmpty())) {
            return false;
        }
        intent.setSelector(null);
        intent.setPackage(str);
        return true;
    }

    @Override // defpackage.C5877hG0, defpackage.InterfaceC5189fG0
    public final boolean c(Intent intent) {
        String uri = intent.toUri(0);
        Pattern pattern = T34.a;
        return T34.e(new GURL(uri));
    }

    @Override // defpackage.C5877hG0, defpackage.InterfaceC5189fG0
    public final boolean d(C11026wG0 c11026wG0) {
        String str = this.c;
        if (!TextUtils.isEmpty(str) && this.d.g(str)) {
            return !C12055zG0.d(str, (List) c11026wG0.get(), false).isEmpty();
        }
        return false;
    }

    @Override // defpackage.C5877hG0, defpackage.InterfaceC5189fG0
    public final boolean a(GURL gurl) {
        B84 b84 = this.e;
        return b84 != null && b84.b(gurl.i());
    }
}
