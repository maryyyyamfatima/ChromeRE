package com.google.android.gms.dynamic;

import android.os.IBinder;
import defpackage.AbstractBinderC8751pe1;
import defpackage.AbstractC9076qb1;
import defpackage.InterfaceC9436re1;
import java.lang.reflect.Field;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ObjectWrapper extends AbstractBinderC8751pe1 {
    public final Object mWrappedObject;

    public ObjectWrapper(Object obj) {
        this.mWrappedObject = obj;
    }

    public static Object h1(InterfaceC9436re1 interfaceC9436re1) {
        if (interfaceC9436re1 instanceof ObjectWrapper) {
            return ((ObjectWrapper) interfaceC9436re1).mWrappedObject;
        }
        IBinder asBinder = interfaceC9436re1.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i == 1) {
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (IllegalAccessException e) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
                } catch (NullPointerException e2) {
                    throw new IllegalArgumentException("Binder object is null.", e2);
                }
            }
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        throw new IllegalArgumentException(AbstractC9076qb1.a("Unexpected number of IObjectWrapper declared fields: ", declaredFields.length));
    }
}
