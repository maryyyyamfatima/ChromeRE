package defpackage;

import android.content.Context;
import android.os.Binder;
import android.util.Log;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: n51, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7880n51 implements EP0 {
    public static C7880n51 c;
    public final Context a;
    public final C7536m51 b;

    public static C7880n51 c(Context context) {
        C7880n51 c7880n51;
        synchronized (C7880n51.class) {
            if (c == null) {
                c = AbstractC0348Cr2.a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new C7880n51(context) : new C7880n51();
            }
            c7880n51 = c;
        }
        return c7880n51;
    }

    public C7880n51(Context context) {
        this.a = context;
        C7536m51 c7536m51 = new C7536m51();
        this.b = c7536m51;
        context.getContentResolver().registerContentObserver(AbstractC7192l51.a, true, c7536m51);
    }

    public C7880n51() {
        this.a = null;
        this.b = null;
    }

    @Override // defpackage.EP0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String a(String str) {
        Context context = this.a;
        if (context != null) {
            if (!(AbstractC6404io0.b() && !AbstractC6404io0.a(context))) {
                try {
                    try {
                        try {
                            return AbstractC7192l51.f(context.getContentResolver(), str, null);
                        } catch (IllegalStateException e) {
                            e = e;
                            Log.e("GservicesLoader", "Unable to read GServices for: " + str, e);
                            return null;
                        } catch (NullPointerException e2) {
                            e = e2;
                            Log.e("GservicesLoader", "Unable to read GServices for: " + str, e);
                            return null;
                        }
                    } catch (SecurityException e3) {
                        e = e3;
                        Log.e("GservicesLoader", "Unable to read GServices for: " + str, e);
                        return null;
                    }
                } catch (SecurityException unused) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        return AbstractC7192l51.f(context.getContentResolver(), str, null);
                    } finally {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
            }
        }
        return null;
    }
}
