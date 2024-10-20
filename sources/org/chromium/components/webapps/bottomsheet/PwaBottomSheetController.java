package org.chromium.components.webapps.bottomsheet;

import J.N;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import androidx.appcompat.app.a;
import com.android.chrome.R;
import defpackage.C7592mF2;
import defpackage.C8966qF2;
import defpackage.C9308rF2;
import defpackage.H14;
import defpackage.InterfaceC7546m7;
import defpackage.K14;
import defpackage.QB;
import org.chromium.components.browser_ui.bottomsheet.m;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class PwaBottomSheetController implements H14, InterfaceC7546m7, View.OnClickListener {
    public final Context a;
    public long g;
    public QB h;
    public final C7592mF2 i = new C7592mF2(this);
    public C9308rF2 j;
    public C8966qF2 k;
    public WebContents l;

    @Override // defpackage.InterfaceC7546m7
    public final boolean a() {
        return false;
    }

    @Override // defpackage.InterfaceC7546m7
    public final void c() {
    }

    @Override // defpackage.H14
    public final /* synthetic */ void t() {
    }

    @Override // defpackage.H14
    public final /* synthetic */ void x() {
    }

    public PwaBottomSheetController(a aVar) {
        this.a = aVar;
    }

    public final boolean d() {
        return this.j != null && ((m) this.h).h() == this.j;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.button_install) {
            N.MXiwiwPi(this.g, this.l);
            ((m) this.h).l(this.j, false, 0);
            return;
        }
        if (id == R.id.drag_handlebar) {
            if (((m) this.h).n()) {
                ((m) this.h).c();
            } else {
                ((m) this.h).e();
            }
        }
    }

    public static void addWebAppScreenshot(Bitmap bitmap, WebContents webContents) {
        WindowAndroid Q0 = webContents.Q0();
        if (Q0 == null) {
            return;
        }
        K14 k14 = PwaBottomSheetControllerProvider.a;
        PwaBottomSheetController pwaBottomSheetController = (PwaBottomSheetController) PwaBottomSheetControllerProvider.a.e(Q0.t);
        if (pwaBottomSheetController == null) {
            return;
        }
        C8966qF2 c8966qF2 = pwaBottomSheetController.k;
        c8966qF2.j.add(bitmap);
        c8966qF2.t();
    }

    @Override // defpackage.InterfaceC7546m7
    public final void b(String str) {
        N.MXiwiwPi(this.g, this.l);
    }
}
