package defpackage;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yu4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11936yu4 {
    public final Object a;
    public final Field b;
    public final Class c;

    public C11936yu4(Object obj, Field field, Class cls) {
        this.a = obj;
        this.b = field;
        this.c = cls;
    }

    public final Object a() {
        Object obj = this.a;
        Field field = this.b;
        Class cls = this.c;
        try {
            return cls.cast(field.get(obj));
        } catch (Exception e) {
            throw new Cu4(String.format("Failed to get value of field %s of type %s on object of type %s", field.getName(), obj.getClass().getName(), cls.getName()), e);
        }
    }

    public final void b(Object obj) {
        Object obj2 = this.a;
        Field field = this.b;
        try {
            field.set(obj2, obj);
        } catch (Exception e) {
            throw new Cu4(String.format("Failed to set value of field %s of type %s on object of type %s", field.getName(), obj2.getClass().getName(), this.c.getName()), e);
        }
    }

    public final void c(List list) {
        Object[] objArr = (Object[]) a();
        int length = objArr == null ? 0 : objArr.length;
        Object[] objArr2 = (Object[]) Array.newInstance(this.b.getType().getComponentType(), list.size() + length);
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            objArr2[length] = it.next();
            length++;
        }
        b(objArr2);
    }

    public final void d(Collection collection) {
        Object[] objArr = (Object[]) a();
        int i = 0;
        Object[] objArr2 = (Object[]) Array.newInstance(this.b.getType().getComponentType(), collection.size() + (objArr == null ? 0 : objArr.length));
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, collection.size(), objArr.length);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArr2[i] = it.next();
            i++;
        }
        b(objArr2);
    }
}
