package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.widget.ProgressBar;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Bv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0235Bv implements Runnable {
    public final C12280zv a;
    public final /* synthetic */ AbstractDialogInterfaceOnCancelListenerC0365Cv g;

    public RunnableC0235Bv(AbstractDialogInterfaceOnCancelListenerC0365Cv abstractDialogInterfaceOnCancelListenerC0365Cv, C12280zv c12280zv) {
        this.g = abstractDialogInterfaceOnCancelListenerC0365Cv;
        this.a = c12280zv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.g.g) {
            ConnectionResult connectionResult = this.a.b;
            if (connectionResult.s1()) {
                AbstractDialogInterfaceOnCancelListenerC0365Cv abstractDialogInterfaceOnCancelListenerC0365Cv = this.g;
                DA1 da1 = abstractDialogInterfaceOnCancelListenerC0365Cv.a;
                Activity b = abstractDialogInterfaceOnCancelListenerC0365Cv.b();
                PendingIntent pendingIntent = connectionResult.h;
                int i = this.a.a;
                int i2 = GoogleApiActivity.g;
                Intent intent = new Intent(b, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", false);
                da1.startActivityForResult(intent, 1);
                return;
            }
            AbstractDialogInterfaceOnCancelListenerC0365Cv abstractDialogInterfaceOnCancelListenerC0365Cv2 = this.g;
            if (abstractDialogInterfaceOnCancelListenerC0365Cv2.j.b(connectionResult.g, abstractDialogInterfaceOnCancelListenerC0365Cv2.b(), null) != null) {
                AbstractDialogInterfaceOnCancelListenerC0365Cv abstractDialogInterfaceOnCancelListenerC0365Cv3 = this.g;
                C8543p11 c8543p11 = abstractDialogInterfaceOnCancelListenerC0365Cv3.j;
                Activity b2 = abstractDialogInterfaceOnCancelListenerC0365Cv3.b();
                AbstractDialogInterfaceOnCancelListenerC0365Cv abstractDialogInterfaceOnCancelListenerC0365Cv4 = this.g;
                c8543p11.j(b2, abstractDialogInterfaceOnCancelListenerC0365Cv4.a, connectionResult.g, abstractDialogInterfaceOnCancelListenerC0365Cv4);
                return;
            }
            if (connectionResult.g == 18) {
                AbstractDialogInterfaceOnCancelListenerC0365Cv abstractDialogInterfaceOnCancelListenerC0365Cv5 = this.g;
                C8543p11 c8543p112 = abstractDialogInterfaceOnCancelListenerC0365Cv5.j;
                Activity b3 = abstractDialogInterfaceOnCancelListenerC0365Cv5.b();
                AbstractDialogInterfaceOnCancelListenerC0365Cv abstractDialogInterfaceOnCancelListenerC0365Cv6 = this.g;
                c8543p112.getClass();
                ProgressBar progressBar = new ProgressBar(b3, null, R.attr.progressBarStyleLarge);
                progressBar.setIndeterminate(true);
                progressBar.setVisibility(0);
                AlertDialog.Builder builder = new AlertDialog.Builder(b3);
                builder.setView(progressBar);
                builder.setMessage(E30.b(b3, 18));
                builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
                AlertDialog create = builder.create();
                C8543p11.i(b3, create, "GooglePlayServicesUpdatingDialog", abstractDialogInterfaceOnCancelListenerC0365Cv6);
                AbstractDialogInterfaceOnCancelListenerC0365Cv abstractDialogInterfaceOnCancelListenerC0365Cv7 = this.g;
                C8543p11 c8543p113 = abstractDialogInterfaceOnCancelListenerC0365Cv7.j;
                Context applicationContext = abstractDialogInterfaceOnCancelListenerC0365Cv7.b().getApplicationContext();
                C0105Av c0105Av = new C0105Av(this, create);
                c8543p113.getClass();
                C8543p11.h(applicationContext, c0105Av);
                return;
            }
            this.g.k(this.a.a, connectionResult);
        }
    }
}
