package defpackage;

import com.google.common.flogger.backend.android.c;
import com.google.common.flogger.backend.google.GooglePlatform;
import com.google.common.flogger.backend.system.DefaultPlatform;
import java.lang.reflect.InvocationTargetException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vv2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10911vv2 {
    public static AbstractC2312Ru2 a() {
        try {
            try {
                try {
                    return (AbstractC2312Ru2) c.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (IllegalAccessException | InstantiationException | NoClassDefFoundError | NoSuchMethodException | InvocationTargetException unused) {
                    return null;
                }
            } catch (IllegalAccessException | InstantiationException | NoClassDefFoundError | NoSuchMethodException | InvocationTargetException unused2) {
                return (AbstractC2312Ru2) DefaultPlatform.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
        } catch (IllegalAccessException | InstantiationException | NoClassDefFoundError | NoSuchMethodException | InvocationTargetException unused3) {
            return (AbstractC2312Ru2) GooglePlatform.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        }
    }
}
