package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xH */
/* loaded from: classes.dex */
public abstract class AbstractC11373xH {
    public static final C4856eI1 a = new C4856eI1("CastDynamiteModule");

    public static InterfaceC12156za1 b(Context context, CastOptions castOptions, InterfaceC0147Bd1 interfaceC0147Bd1, HashMap hashMap) {
        InterfaceC12156za1 c11470xa1;
        InterfaceC0912Ha1 a2 = a(context);
        ObjectWrapper objectWrapper = new ObjectWrapper(context.getApplicationContext());
        C0652Fa1 c0652Fa1 = (C0652Fa1) a2;
        Parcel a3 = c0652Fa1.a();
        AbstractC11786yV.c(a3, objectWrapper);
        AbstractC11786yV.b(a3, castOptions);
        AbstractC11786yV.c(a3, interfaceC0147Bd1);
        a3.writeMap(hashMap);
        Parcel e = c0652Fa1.e(1, a3);
        IBinder readStrongBinder = e.readStrongBinder();
        int i = AbstractBinderC11813ya1.a;
        if (readStrongBinder == null) {
            c11470xa1 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastContext");
            if (queryLocalInterface instanceof InterfaceC12156za1) {
                c11470xa1 = (InterfaceC12156za1) queryLocalInterface;
            } else {
                c11470xa1 = new C11470xa1(readStrongBinder);
            }
        }
        e.recycle();
        return c11470xa1;
    }

    public static InterfaceC0912Ha1 a(Context context) {
        try {
            IBinder h = C1146Iv0.i(context, C1146Iv0.l, "com.google.android.gms.cast.framework.dynamite").h("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl");
            int i = AbstractBinderC0782Ga1.a;
            if (h == null) {
                return null;
            }
            IInterface queryLocalInterface = h.queryLocalInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
            if (queryLocalInterface instanceof InterfaceC0912Ha1) {
                return (InterfaceC0912Ha1) queryLocalInterface;
            }
            return new C0652Fa1(h);
        } catch (C0626Ev0 e) {
            throw new GY1(e);
        }
    }
}
