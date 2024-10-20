package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.youtube.player.internal.bl;
import java.lang.reflect.InvocationTargetException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class Ju4 {
    public static IBinder a(Class cls, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4) {
        try {
            return (IBinder) cls.getConstructor(IBinder.class, IBinder.class, IBinder.class, IBinder.class).newInstance(iBinder, iBinder2, iBinder3, iBinder4);
        } catch (IllegalAccessException e) {
            String name = cls.getName();
            throw new Hu4(name.length() == 0 ? new String("Unable to call the default constructor of ") : "Unable to call the default constructor of ".concat(name), e);
        } catch (InstantiationException e2) {
            String name2 = cls.getName();
            throw new Hu4(name2.length() == 0 ? new String("Unable to instantiate the dynamic class ") : "Unable to instantiate the dynamic class ".concat(name2), e2);
        } catch (NoSuchMethodException e3) {
            String name3 = cls.getName();
            throw new Hu4(name3.length() == 0 ? new String("Could not find the right constructor for ") : "Could not find the right constructor for ".concat(name3), e3);
        } catch (InvocationTargetException e4) {
            String name4 = cls.getName();
            throw new Hu4(name4.length() == 0 ? new String("Exception thrown by invoked constructor in ") : "Exception thrown by invoked constructor in ".concat(name4), e4);
        }
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [Eu4, android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r4v4, types: [Eu4, android.os.IBinder] */
    public static Aw4 b(VS0 vs0, IBinder iBinder, IBinder iBinder2) {
        Context context;
        try {
            context = vs0.createPackageContext(Ru4.a(vs0), 3);
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e.getMessage());
            Pu4.a(valueOf.length() == 0 ? new String("NameNotFoundException ") : "NameNotFoundException ".concat(valueOf), new Object[0]);
            context = null;
        }
        if (context == null) {
            context = null;
        }
        if (context == null) {
            throw new Hu4("Could not create remote context");
        }
        if (iBinder == null || iBinder2 == null) {
            throw new Hu4("Could not create fragment with null binder");
        }
        try {
            IBinder a = a(context.getClassLoader().loadClass("com.google.android.apps.youtube.embeddedplayer.service.jar.client.RemoteEmbedFragment"), bl.a(context), bl.a(vs0), iBinder, iBinder2);
            int i = yw4.g;
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.youtube.player.internal.IEmbedFragment");
            return queryLocalInterface instanceof Aw4 ? (Aw4) queryLocalInterface : new ww4(a);
        } catch (ClassNotFoundException e2) {
            throw new Hu4("Unable to find dynamic class com.google.android.apps.youtube.embeddedplayer.service.jar.client.RemoteEmbedFragment", e2);
        }
    }
}
