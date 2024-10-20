package org.chromium.components.media_router.caf.remoting;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.mediarouter.app.MediaRouteButton;
import com.android.chrome.R;
import defpackage.C1560Ma0;
import defpackage.EI2;
import defpackage.IE;
import defpackage.InterfaceC5764gw;
import defpackage.JE;
import defpackage.QM2;
import defpackage.VS0;
import java.lang.ref.WeakReference;
import org.chromium.components.media_router.caf.remoting.CafExpandedControllerActivity;
import org.chromium.third_party.android.media.MediaController;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class CafExpandedControllerActivity extends VS0 implements InterfaceC5764gw {
    public MediaRouteButton A;
    public TextView B;
    public IE C;
    public final JE D = new JE(this);
    public Handler x;
    public MediaController y;
    public QM2 z;

    @Override // defpackage.InterfaceC5764gw
    public final void p() {
    }

    /* JADX WARN: Type inference failed for: r5v19, types: [IE] */
    @Override // defpackage.VS0, defpackage.AbstractActivityC6817k00, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int intExtra;
        super.onCreate(bundle);
        WeakReference weakReference = QM2.g;
        this.z = weakReference != null ? (QM2) weakReference.get() : null;
        Intent intent = getIntent();
        if (intent != null && (intExtra = intent.getIntExtra("org.chromium.chrome.browser.metrics.MediaNotificationUma.EXTRA_CLICK_SOURCE", -1)) != -1 && intExtra < 3) {
            EI2.h(intExtra, 3, "Media.Notification.Click");
        }
        QM2 qm2 = this.z;
        if (qm2 != null && qm2.g()) {
            this.z.e.add(this);
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            setContentView(R.layout.0_resource_name_obfuscated_res_0x7f0e00fc);
            ViewGroup viewGroup = (ViewGroup) findViewById(android.R.id.content);
            viewGroup.setBackgroundColor(-16777216);
            MediaController mediaController = (MediaController) findViewById(R.id.cast_media_controller);
            this.y = mediaController;
            mediaController.a = this.D;
            mediaController.c();
            View inflate = getLayoutInflater().inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e007a, viewGroup, false);
            if (inflate instanceof MediaRouteButton) {
                MediaRouteButton mediaRouteButton = (MediaRouteButton) inflate;
                this.A = mediaRouteButton;
                viewGroup.addView(mediaRouteButton);
                this.A.bringToFront();
                MediaRouteButton mediaRouteButton2 = this.A;
                C1560Ma0 c1560Ma0 = this.z.c;
                mediaRouteButton2.e((c1560Ma0 != null ? c1560Ma0.a : null).b());
            }
            this.B = (TextView) findViewById(R.id.cast_screen_title);
            this.x = new Handler();
            this.C = new Runnable() { // from class: IE
                @Override // java.lang.Runnable
                public final void run() {
                    CafExpandedControllerActivity cafExpandedControllerActivity = CafExpandedControllerActivity.this;
                    cafExpandedControllerActivity.y.d();
                    cafExpandedControllerActivity.x.postDelayed(cafExpandedControllerActivity.C, 1000L);
                }
            };
            k0();
            return;
        }
        finish();
    }

    @Override // defpackage.VS0, android.app.Activity
    public final void onResume() {
        super.onResume();
        QM2 qm2 = this.z;
        if (qm2 == null || !qm2.g()) {
            finish();
        }
    }

    @Override // defpackage.VS0, android.app.Activity
    public final void onDestroy() {
        this.z.e.remove(this);
        super.onDestroy();
    }

    @Override // defpackage.InterfaceC5764gw
    public final void S() {
        finish();
    }

    @Override // defpackage.InterfaceC5764gw
    public final void G() {
        k0();
    }

    @Override // defpackage.InterfaceC5764gw
    public final void j() {
        k0();
    }

    public final void k0() {
        if (this.z.g()) {
            String str = this.z.a.i.i;
            this.B.setText(str != null ? getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f1402f9, str) : "");
            MediaController mediaController = this.y;
            mediaController.d();
            mediaController.b();
            mediaController.c();
            this.y.d();
            this.x.removeCallbacks(this.C);
            if (this.z.a.h.l()) {
                this.x.postDelayed(this.C, 1000L);
            }
        }
    }
}
