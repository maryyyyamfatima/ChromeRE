package defpackage;

import J.N;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Vibrator;
import android.provider.Settings;
import com.android.chrome.R;
import org.chromium.chrome.browser.findinpage.a;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.components.find_in_page.FindMatchRectsDetails;
import org.chromium.components.find_in_page.FindNotificationDetails;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class QN0 extends BA0 {
    public final /* synthetic */ a a;

    public QN0(a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.BA0
    public final void g0(Tab tab, WindowAndroid windowAndroid) {
        if (windowAndroid == null) {
            a aVar = this.a;
            if (aVar.getVisibility() == 0) {
                aVar.d(true);
            }
        }
    }

    @Override // defpackage.BA0
    public final void y0(FindMatchRectsDetails findMatchRectsDetails) {
        a aVar = this.a;
        if (aVar.l == null) {
            return;
        }
        if (aVar.g.getText().length() <= 0) {
            aVar.l.b(-1, new RectF[0], null);
        } else {
            aVar.l.b(findMatchRectsDetails.a, findMatchRectsDetails.b, findMatchRectsDetails.c);
        }
    }

    @Override // defpackage.BA0
    public final void z0(FindNotificationDetails findNotificationDetails) {
        String string;
        a aVar = this.a;
        NN0 nn0 = aVar.l;
        if (nn0 != null) {
            nn0.D = false;
        }
        int i = findNotificationDetails.c;
        boolean z = findNotificationDetails.d;
        int i2 = findNotificationDetails.a;
        if ((i == -1 || i2 == 1) && !z) {
            return;
        }
        if (z) {
            if (i2 > 0) {
                IN0 in0 = aVar.s;
                N.M4m8QCn$(in0.b, in0, nn0 != null ? nn0.u : -1);
            } else {
                aVar.c();
            }
            aVar.e(findNotificationDetails.b);
        }
        Context context = aVar.getContext();
        Resources resources = context.getResources();
        int i3 = findNotificationDetails.c;
        aVar.u(resources.getString(R.string.0_resource_name_obfuscated_res_0x7f1404b4, Integer.valueOf(Math.max(i3, 0)), Integer.valueOf(i2)), i2 == 0);
        boolean z2 = i2 > 0;
        aVar.i.setEnabled(z2);
        aVar.j.setEnabled(z2);
        int max = Math.max(i3, 0);
        Context context2 = aVar.getContext();
        if (i2 > 0) {
            string = context2.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f14019c, Integer.valueOf(max), Integer.valueOf(i2));
        } else {
            string = context2.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f14019d);
        }
        aVar.a.setContentDescription(string);
        if (!aVar.B) {
            PN0 pn0 = aVar.A;
            Handler handler = aVar.z;
            if (pn0 != null) {
                handler.removeCallbacks(pn0);
            }
            PN0 pn02 = new PN0(aVar, string);
            aVar.A = pn02;
            handler.postDelayed(pn02, 500L);
        }
        if (i2 == 0 && z) {
            IN0 in02 = aVar.s;
            if (N.M3t_h9OB(in02.b, in02).startsWith(aVar.g.getText().toString())) {
                return;
            }
            if (Settings.System.getInt(context.getContentResolver(), "haptic_feedback_enabled", 1) == 1) {
                ((Vibrator) context.getSystemService("vibrator")).vibrate(50L);
            }
        }
    }

    @Override // defpackage.BA0
    public final void K0(Tab tab, GURL gurl) {
        this.a.d(true);
    }

    @Override // defpackage.BA0
    public final void k0(Tab tab, boolean z) {
        if (z) {
            this.a.d(true);
        }
    }

    @Override // defpackage.BA0
    public final void l0(Tab tab) {
        this.a.d(true);
    }
}
