package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Kv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1405Kv {
    public final Context a;
    public final String c;
    public final String d;
    public Object g;
    public final Object b = new Object();
    public boolean e = false;
    public boolean f = false;

    public abstract Object a(C1146Iv0 c1146Iv0, Context context);

    public abstract void c();

    public AbstractC1405Kv(Context context, String str, String str2) {
        this.a = context;
        this.c = str;
        this.d = str2;
    }

    public final boolean e() {
        return d() != null;
    }

    public final void b() {
        synchronized (this.b) {
            if (this.g == null) {
                return;
            }
            try {
                c();
            } catch (RemoteException e) {
                Log.e(this.c, "Could not finalize native handle", e);
            }
        }
    }

    public final Object d() {
        synchronized (this.b) {
            Object obj = this.g;
            if (obj != null) {
                return obj;
            }
            C1146Iv0 f = f(this.a, this.d);
            if (f == null && !this.e) {
                Object[] objArr = {this.d};
                if (Log.isLoggable("Vision", 3)) {
                    String.format("Broadcasting download intent for dependency %s", objArr);
                }
                String str = this.d;
                Intent intent = new Intent();
                intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
                intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", str);
                intent.setAction("com.google.android.gms.vision.DEPENDENCY");
                this.a.sendBroadcast(intent);
                this.e = true;
            }
            if (f != null) {
                try {
                    this.g = a(f, this.a);
                } catch (C0626Ev0 | RemoteException e) {
                    Log.e(this.c, "Error creating remote native handle", e);
                }
            }
            boolean z = this.f;
            if (!z && this.g == null) {
                Log.w(this.c, "Native handle not yet available. Reverting to no-op handle.");
                this.f = true;
            } else if (z && this.g != null) {
                Log.w(this.c, "Native handle is now available.");
            }
            return this.g;
        }
    }

    public static C1146Iv0 f(Context context, String str) {
        try {
            return C1146Iv0.i(context, C1146Iv0.n, AbstractC4809e90.a("com.google.android.gms.vision.dynamite.", str));
        } catch (C0626Ev0 unused) {
            String format = String.format("%s.%s", "com.google.android.gms.vision", str);
            Object[] objArr = {format};
            if (Log.isLoggable("Vision", 3)) {
                String.format("Cannot load thick client module, fall back to load optional module %s", objArr);
            }
            try {
                return C1146Iv0.i(context, C1146Iv0.l, format);
            } catch (C0626Ev0 e) {
                Object[] objArr2 = {format};
                if (Log.isLoggable("Vision", 5)) {
                    if (Log.isLoggable("Vision", 3)) {
                        Log.w("Vision", String.format("Error loading optional module %s", objArr2), e);
                    } else {
                        Log.w("Vision", String.format("Error loading optional module %s", objArr2) + ": " + String.valueOf(e));
                    }
                }
                return null;
            }
        }
    }
}
