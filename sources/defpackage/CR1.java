package defpackage;

import J.N;
import android.text.TextUtils;
import com.android.chrome.R;
import java.util.Collections;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class CR1 extends Fl4 {
    public final /* synthetic */ WebContents g;
    public final /* synthetic */ ER1 h;

    @Override // defpackage.Fl4
    public final void titleWasSet(String str) {
        ER1 er1 = this.h;
        er1.getClass();
        String trim = str.trim();
        if (trim.startsWith("▶")) {
            trim = trim.substring(1).trim();
        }
        if (TextUtils.equals(er1.l, trim)) {
            return;
        }
        er1.l = trim;
        ER1.a(er1);
    }

    @Override // defpackage.Fl4
    public final void wasShown() {
        int id = this.h.a.a.getId();
        C6948kO1 c6948kO1 = (C6948kO1) AbstractC8667pO1.a.get(R.id.media_playback_notification);
        if (c6948kO1 == null) {
            return;
        }
        c6948kO1.a(id);
    }

    @Override // defpackage.Fl4
    public final void didFinishNavigation(NavigationHandle navigationHandle) {
        if (navigationHandle.g && navigationHandle.a && !navigationHandle.c) {
            String MeroQv$e = N.MeroQv$e(this.g.u().e().i());
            ER1 er1 = this.h;
            er1.i = MeroQv$e;
            er1.g = null;
            er1.f = null;
            er1.n = null;
            er1.o = er1.e();
            er1.p = Collections.emptySet();
            if (er1.g()) {
                return;
            }
            C7636mO1 c7636mO1 = er1.k;
            c7636mO1.c = er1.i;
            c7636mO1.g = er1.g;
            c7636mO1.i = er1.f;
            c7636mO1.a = er1.o;
            c7636mO1.n = er1.p;
            er1.i();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CR1(ER1 er1, WebContents webContents, WebContents webContents2) {
        super(webContents);
        this.h = er1;
        this.g = webContents2;
    }
}
