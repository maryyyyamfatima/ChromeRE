package defpackage;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.BufferedWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cu1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4379cu1 implements P82, L74 {
    public boolean a = true;
    public final JsonWriter b;
    public final Map c;
    public final Map d;
    public final O82 e;
    public final boolean f;

    public C4379cu1(BufferedWriter bufferedWriter, HashMap hashMap, HashMap hashMap2, C1786Nt1 c1786Nt1, boolean z) {
        this.b = new JsonWriter(bufferedWriter);
        this.c = hashMap;
        this.d = hashMap2;
        this.e = c1786Nt1;
        this.f = z;
    }

    @Override // defpackage.P82
    public final P82 a(C5219fM0 c5219fM0, Object obj) {
        return f(obj, c5219fM0.a);
    }

    @Override // defpackage.P82
    public final P82 d(C5219fM0 c5219fM0, long j) {
        String str = c5219fM0.a;
        g();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        g();
        jsonWriter.value(j);
        return this;
    }

    public final C4379cu1 f(Object obj, String str) {
        boolean z = this.f;
        JsonWriter jsonWriter = this.b;
        if (z) {
            if (obj == null) {
                return this;
            }
            g();
            jsonWriter.name(str);
            return e(obj);
        }
        g();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        return e(obj);
    }

    @Override // defpackage.L74
    public final L74 b(String str) {
        g();
        this.b.value(str);
        return this;
    }

    @Override // defpackage.L74
    public final L74 c(boolean z) {
        g();
        this.b.value(z);
        return this;
    }

    public final C4379cu1 e(Object obj) {
        JsonWriter jsonWriter = this.b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        int i = 0;
        if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                g();
                jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
                return this;
            }
            jsonWriter.beginArray();
            if (obj instanceof int[]) {
                int length = ((int[]) obj).length;
                while (i < length) {
                    jsonWriter.value(r7[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i < length2) {
                    long j = jArr[i];
                    g();
                    jsonWriter.value(j);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i < length3) {
                    jsonWriter.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    jsonWriter.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof Number[]) {
                Number[] numberArr = (Number[]) obj;
                int length5 = numberArr.length;
                while (i < length5) {
                    e(numberArr[i]);
                    i++;
                }
            } else {
                Object[] objArr = (Object[]) obj;
                int length6 = objArr.length;
                while (i < length6) {
                    e(objArr[i]);
                    i++;
                }
            }
            jsonWriter.endArray();
            return this;
        }
        if (obj instanceof Collection) {
            jsonWriter.beginArray();
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                e(it.next());
            }
            jsonWriter.endArray();
            return this;
        }
        if (obj instanceof Map) {
            jsonWriter.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    f(entry.getValue(), (String) key);
                } catch (ClassCastException e) {
                    throw new QA0(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                }
            }
            jsonWriter.endObject();
            return this;
        }
        O82 o82 = (O82) this.c.get(obj.getClass());
        if (o82 != null) {
            jsonWriter.beginObject();
            o82.a(obj, this);
            jsonWriter.endObject();
            return this;
        }
        K74 k74 = (K74) this.d.get(obj.getClass());
        if (k74 != null) {
            k74.a(obj, this);
            return this;
        }
        if (obj instanceof Enum) {
            String name = ((Enum) obj).name();
            g();
            jsonWriter.value(name);
            return this;
        }
        jsonWriter.beginObject();
        this.e.a(obj, this);
        jsonWriter.endObject();
        return this;
    }

    public final void g() {
        if (!this.a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
