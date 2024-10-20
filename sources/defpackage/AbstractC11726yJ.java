package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import java.util.ArrayDeque;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yJ */
/* loaded from: classes.dex */
public abstract class AbstractC11726yJ {
    public final Runnable a;
    public final Handler c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean i;
    public final ArrayDeque b = new ArrayDeque();
    public C10697vJ j = new C10697vJ();
    public final boolean g = false;
    public final boolean h = false;

    public abstract VJ c(Context context, Bundle bundle, C10011tJ c10011tJ);

    public abstract void d(VJ vj);

    public abstract int e();

    public static void a(Context context, String str, String str2) {
        try {
            context.getPackageManager().getServiceInfo(new ComponentName(str, str2.concat("0")), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            throw new RuntimeException("Illegal meta data value: the child service doesn't exist");
        }
    }

    public static C11040wJ b(Context context, Handler handler, RunnableC6240iK runnableC6240iK, String str, String str2, String str3, boolean z) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(str, 128).metaData;
            int i = bundle != null ? bundle.getInt(str3, -1) : -1;
            if (i < 0) {
                throw new RuntimeException("Illegal meta data value for number of child services");
            }
            a(context, str, str2);
            return new C11040wJ(handler, runnableC6240iK, str, str2, z, i);
        } catch (PackageManager.NameNotFoundException unused) {
            throw new RuntimeException("Could not get application info.");
        }
    }

    public AbstractC11726yJ(Handler handler, RunnableC6240iK runnableC6240iK, String str, String str2, String str3, boolean z) {
        this.c = handler;
        this.a = runnableC6240iK;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.i = z;
    }
}
