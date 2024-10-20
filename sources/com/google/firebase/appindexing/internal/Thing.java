package com.google.firebase.appindexing.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.AbstractC10761vV3;
import defpackage.C11450xW1;
import defpackage.C7618mK3;
import defpackage.C84;
import defpackage.InterfaceC4325cl1;
import defpackage.RT2;
import defpackage.W82;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Thing extends AbstractSafeParcelable implements InterfaceC4325cl1, ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C7618mK3();
    public final int a;
    public final Bundle g;
    public final Metadata h;
    public final String i;
    public final String j;

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public class Metadata extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new C11450xW1();
        public final boolean a;
        public final int g;
        public final String h;
        public final Bundle i;
        public final Bundle j;

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int a = RT2.a(20293, parcel);
            RT2.f(parcel, 1, 4);
            parcel.writeInt(this.a ? 1 : 0);
            RT2.f(parcel, 2, 4);
            parcel.writeInt(this.g);
            RT2.o(parcel, 3, this.h);
            RT2.c(parcel, 4, this.i);
            RT2.c(parcel, 5, this.j);
            RT2.b(a, parcel);
        }

        public Metadata(boolean z, int i, String str, Bundle bundle, Bundle bundle2) {
            this.a = z;
            this.g = i;
            this.h = str;
            this.i = bundle == null ? new Bundle() : bundle;
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            this.j = bundle2;
            ClassLoader classLoader = getClass().getClassLoader();
            C84.a(classLoader);
            bundle2.setClassLoader(classLoader);
        }

        public final String toString() {
            StringBuilder a = AbstractC10761vV3.a("worksOffline: ");
            a.append(this.a);
            a.append(", score: ");
            a.append(this.g);
            String str = this.h;
            if (!str.isEmpty()) {
                a.append(", accountEmail: ");
                a.append(str);
            }
            Bundle bundle = this.i;
            if (bundle != null && !bundle.isEmpty()) {
                a.append(", Properties { ");
                Thing.r1(bundle, a);
                a.append("}");
            }
            Bundle bundle2 = this.j;
            if (!bundle2.isEmpty()) {
                a.append(", embeddingProperties { ");
                Thing.r1(bundle2, a);
                a.append("}");
            }
            return a.toString();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Metadata)) {
                return false;
            }
            Metadata metadata = (Metadata) obj;
            return W82.a(Boolean.valueOf(this.a), Boolean.valueOf(metadata.a)) && W82.a(Integer.valueOf(this.g), Integer.valueOf(metadata.g)) && W82.a(this.h, metadata.h) && Thing.s1(this.i, metadata.i) && Thing.s1(this.j, metadata.j);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Integer.valueOf(this.g), this.h, Integer.valueOf(Thing.t1(this.i)), Integer.valueOf(Thing.t1(this.j))});
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.c(parcel, 1, this.g);
        RT2.n(parcel, 2, this.h, i);
        RT2.o(parcel, 3, this.i);
        RT2.o(parcel, 4, this.j);
        RT2.f(parcel, 1000, 4);
        parcel.writeInt(this.a);
        RT2.b(a, parcel);
    }

    public Thing(int i, Bundle bundle, Metadata metadata, String str, String str2) {
        this.a = i;
        this.g = bundle;
        this.h = metadata;
        this.i = str;
        this.j = str2;
        ClassLoader classLoader = Thing.class.getClassLoader();
        C84.a(classLoader);
        bundle.setClassLoader(classLoader);
    }

    public Thing(Bundle bundle, Metadata metadata, String str, String str2) {
        this.a = 10;
        this.g = bundle;
        this.h = metadata;
        this.i = str;
        this.j = str2;
    }

    public static void r1(Bundle bundle, StringBuilder sb) {
        try {
            Set<String> keySet = bundle.keySet();
            String[] strArr = (String[]) keySet.toArray(new String[keySet.size()]);
            Arrays.sort(strArr, new Comparator() { // from class: lK3
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    String str = (String) obj;
                    String str2 = (String) obj2;
                    if (str == null) {
                        return str2 == null ? 0 : -1;
                    }
                    if (str2 == null) {
                        return 1;
                    }
                    return str.compareTo(str2);
                }
            });
            for (String str : strArr) {
                sb.append("{ key: '");
                sb.append(str);
                sb.append("' value: ");
                Object obj = bundle.get(str);
                if (obj == null) {
                    sb.append("<null>");
                } else if (obj.getClass().isArray()) {
                    sb.append("[ ");
                    for (int i = 0; i < Array.getLength(obj); i++) {
                        sb.append("'");
                        sb.append(Array.get(obj, i));
                        sb.append("' ");
                    }
                    sb.append("]");
                } else {
                    sb.append(obj.toString());
                }
                sb.append(" } ");
            }
        } catch (RuntimeException unused) {
            sb.append("<error>");
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.j;
        if (str.equals("Thing")) {
            str = "Indexable";
        }
        sb.append(str);
        sb.append(" { { id: ");
        String str2 = this.i;
        if (str2 == null) {
            sb.append("<null>");
        } else {
            sb.append("'");
            sb.append(str2);
            sb.append("'");
        }
        sb.append(" } Properties { ");
        r1(this.g, sb);
        sb.append("} Metadata { ");
        sb.append(this.h.toString());
        sb.append(" } }");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Thing)) {
            return false;
        }
        Thing thing = (Thing) obj;
        return W82.a(Integer.valueOf(this.a), Integer.valueOf(thing.a)) && W82.a(this.i, thing.i) && W82.a(this.j, thing.j) && W82.a(this.h, thing.h) && s1(this.g, thing.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.i, this.j, Integer.valueOf(this.h.hashCode()), Integer.valueOf(t1(this.g))});
    }

    public static boolean s1(Bundle bundle, Bundle bundle2) {
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle) && !s1((Bundle) obj, (Bundle) obj2)) {
                return false;
            }
            if (obj == null && (obj2 != null || !bundle2.containsKey(str))) {
                return false;
            }
            if (obj instanceof boolean[]) {
                if (!(obj2 instanceof boolean[]) || !Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                    return false;
                }
            } else if (obj instanceof long[]) {
                if (!(obj2 instanceof long[]) || !Arrays.equals((long[]) obj, (long[]) obj2)) {
                    return false;
                }
            } else if (obj instanceof double[]) {
                if (!(obj2 instanceof double[]) || !Arrays.equals((double[]) obj, (double[]) obj2)) {
                    return false;
                }
            } else if (obj instanceof byte[]) {
                if (!(obj2 instanceof byte[]) || !Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                    return false;
                }
            } else if ((obj instanceof Object[]) && (!(obj2 instanceof Object[]) || !Arrays.equals((Object[]) obj, (Object[]) obj2))) {
                return false;
            }
        }
        return true;
    }

    public static int t1(Bundle bundle) {
        ArrayList arrayList = new ArrayList(bundle.keySet());
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            if (obj instanceof boolean[]) {
                arrayList2.add(Integer.valueOf(Arrays.hashCode((boolean[]) obj)));
            } else if (obj instanceof long[]) {
                arrayList2.add(Integer.valueOf(Arrays.hashCode((long[]) obj)));
            } else if (obj instanceof double[]) {
                arrayList2.add(Integer.valueOf(Arrays.hashCode((double[]) obj)));
            } else if (obj instanceof byte[]) {
                arrayList2.add(Integer.valueOf(Arrays.hashCode((byte[]) obj)));
            } else if (obj instanceof Object[]) {
                arrayList2.add(Integer.valueOf(Arrays.hashCode((Object[]) obj)));
            } else {
                arrayList2.add(Integer.valueOf(Arrays.hashCode(new Object[]{obj})));
            }
        }
        return Arrays.hashCode(arrayList2.toArray());
    }
}
