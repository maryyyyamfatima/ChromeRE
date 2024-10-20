package defpackage;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Cv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractDialogInterfaceOnCancelListenerC0365Cv extends LifecycleCallback implements DialogInterface.OnCancelListener {
    public volatile boolean g;
    public final AtomicReference h;
    public final HandlerC10413uU3 i;
    public final C8543p11 j;

    public abstract void m(int i, ConnectionResult connectionResult);

    public abstract void n();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractDialogInterfaceOnCancelListenerC0365Cv(DA1 da1) {
        super(da1);
        C8543p11 c8543p11 = C8543p11.d;
        this.h = new AtomicReference(null);
        this.i = new HandlerC10413uU3(Looper.getMainLooper());
        this.j = c8543p11;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        ConnectionResult connectionResult = new ConnectionResult(13, null);
        C12280zv c12280zv = (C12280zv) this.h.get();
        k(c12280zv == null ? -1 : c12280zv.a, connectionResult);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void e(Bundle bundle) {
        C12280zv c12280zv;
        if (bundle != null) {
            AtomicReference atomicReference = this.h;
            if (bundle.getBoolean("resolving_error", false)) {
                c12280zv = new C12280zv(bundle.getInt("failed_client_id", -1), new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")));
            } else {
                c12280zv = null;
            }
            atomicReference.set(c12280zv);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void d(int i, int i2, Intent intent) {
        C12280zv c12280zv = (C12280zv) this.h.get();
        if (i != 1) {
            if (i == 2) {
                int g = this.j.g(b());
                if (g == 0) {
                    l();
                    return;
                } else {
                    if (c12280zv == null) {
                        return;
                    }
                    if (c12280zv.b.g == 18 && g == 18) {
                        return;
                    }
                }
            }
        } else if (i2 == -1) {
            l();
            return;
        } else if (i2 == 0) {
            if (c12280zv == null) {
                return;
            }
            k(c12280zv.a, new ConnectionResult(1, intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, c12280zv.b.toString()));
            return;
        }
        if (c12280zv != null) {
            k(c12280zv.a, c12280zv.b);
        }
    }

    public final void l() {
        this.h.set(null);
        n();
    }

    public final void k(int i, ConnectionResult connectionResult) {
        this.h.set(null);
        m(i, connectionResult);
    }

    public final void j(int i, ConnectionResult connectionResult) {
        boolean z;
        C12280zv c12280zv = new C12280zv(i, connectionResult);
        AtomicReference atomicReference = this.h;
        while (true) {
            if (atomicReference.compareAndSet(null, c12280zv)) {
                z = true;
                break;
            } else if (atomicReference.get() != null) {
                z = false;
                break;
            }
        }
        if (z) {
            this.i.post(new RunnableC0235Bv(this, c12280zv));
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void g(Bundle bundle) {
        C12280zv c12280zv = (C12280zv) this.h.get();
        if (c12280zv == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", c12280zv.a);
        ConnectionResult connectionResult = c12280zv.b;
        bundle.putInt("failed_status", connectionResult.g);
        bundle.putParcelable("failed_resolution", connectionResult.h);
    }
}
