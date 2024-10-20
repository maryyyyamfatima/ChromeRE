package com.google.vr.vrcore.library.api;

import android.os.IBinder;
import com.google.vr.sdk.common.deps.b;
import defpackage.InterfaceC9094qe1;
import java.lang.reflect.Field;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class ObjectWrapper extends b implements InterfaceC9094qe1 {
    public static final /* synthetic */ int a = 0;
    private final Object wrappedObject;

    public ObjectWrapper(Object obj) {
        attachInterface(this, "com.google.vr.vrcore.library.api.IObjectWrapper");
        this.wrappedObject = obj;
    }

    public static Object a(InterfaceC9094qe1 interfaceC9094qe1, Class cls) {
        if (interfaceC9094qe1 == null) {
            return null;
        }
        if (interfaceC9094qe1 instanceof ObjectWrapper) {
            return ((ObjectWrapper) interfaceC9094qe1).wrappedObject;
        }
        IBinder asBinder = interfaceC9094qe1.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        int length = declaredFields.length;
        int i = 0;
        Field field = null;
        while (true) {
            if (i >= length) {
                break;
            }
            Field field2 = declaredFields[i];
            if (!field2.isSynthetic()) {
                if (field != null) {
                    field = null;
                    break;
                }
                field = field2;
            }
            i++;
        }
        if (field != null) {
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    Object obj = field.get(asBinder);
                    if (obj == null) {
                        return null;
                    }
                    if (!cls.isInstance(obj)) {
                        throw new IllegalArgumentException("remoteBinder is the wrong class.");
                    }
                    return cls.cast(obj);
                } catch (IllegalAccessException e) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
                } catch (IllegalArgumentException e2) {
                    throw new IllegalArgumentException("remoteBinder is the wrong class.", e2);
                } catch (NullPointerException e3) {
                    throw new IllegalArgumentException("Binder object is null.", e3);
                }
            }
            throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
        }
        throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
    }
}
