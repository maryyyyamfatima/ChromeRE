package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class F84 {
    public final C1439Lb3 a;
    public final C1439Lb3 b;
    public final C1439Lb3 c;

    public abstract G84 a();

    public abstract boolean e(int i);

    public abstract void i(int i);

    public F84(C1439Lb3 c1439Lb3, C1439Lb3 c1439Lb32, C1439Lb3 c1439Lb33) {
        this.a = c1439Lb3;
        this.b = c1439Lb32;
        this.c = c1439Lb33;
    }

    public final void j(int i, int i2) {
        i(i2);
        ((G84) this).e.writeInt(i);
    }

    public final void k(Parcelable parcelable, int i) {
        i(i);
        ((G84) this).e.writeParcelable(parcelable, 0);
    }

    public final int f(int i, int i2) {
        return !e(i2) ? i : ((G84) this).e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((G84) this).e.readParcelable(G84.class.getClassLoader());
    }

    public final void l(H84 h84) {
        if (h84 == null) {
            ((G84) this).e.writeString(null);
            return;
        }
        try {
            ((G84) this).e.writeString(b(h84.getClass()).getName());
            G84 a = a();
            try {
                d(h84.getClass()).invoke(null, h84, a);
                int i = a.i;
                if (i >= 0) {
                    int i2 = a.d.get(i);
                    Parcel parcel = a.e;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(dataPosition - i2);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException(e3);
            } catch (InvocationTargetException e4) {
                Throwable cause = e4.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException(e4);
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(h84.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }

    public final H84 h() {
        String readString = ((G84) this).e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (H84) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(e4);
        }
    }

    public final Method c(String str) {
        C1439Lb3 c1439Lb3 = this.a;
        Method method = (Method) c1439Lb3.get(str);
        if (method != null) {
            return method;
        }
        Method declaredMethod = Class.forName(str, true, F84.class.getClassLoader()).getDeclaredMethod("read", F84.class);
        c1439Lb3.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Method d(Class cls) {
        String name = cls.getName();
        C1439Lb3 c1439Lb3 = this.b;
        Method method = (Method) c1439Lb3.get(name);
        if (method != null) {
            return method;
        }
        Method declaredMethod = b(cls).getDeclaredMethod("write", cls, F84.class);
        c1439Lb3.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public final Class b(Class cls) {
        String name = cls.getName();
        C1439Lb3 c1439Lb3 = this.c;
        Class cls2 = (Class) c1439Lb3.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        c1439Lb3.put(cls.getName(), cls3);
        return cls3;
    }
}
