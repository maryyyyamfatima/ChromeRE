package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: au3 */
/* loaded from: classes.dex */
public final class C3694au3 {
    public final HashMap a;
    public final HashMap b;
    public final ArrayList c;

    public C3694au3(List list) {
        List emptyList = Collections.emptyList();
        List emptyList2 = Collections.emptyList();
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC0090As interfaceC0090As = (InterfaceC0090As) it.next();
            if (TextUtils.isEmpty(interfaceC0090As.name())) {
                Log.w("MobStore.FileStorage", "Cannot register backend, name empty");
            } else {
                InterfaceC0090As interfaceC0090As2 = (InterfaceC0090As) this.a.put(interfaceC0090As.name(), interfaceC0090As);
                if (interfaceC0090As2 != null) {
                    throw new IllegalArgumentException(IR0.a("Cannot override Backend ", interfaceC0090As2.getClass().getCanonicalName(), " with ", interfaceC0090As.getClass().getCanonicalName()));
                }
            }
        }
        Iterator it2 = emptyList.iterator();
        if (it2.hasNext()) {
            X5.a(it2.next());
            throw null;
        }
        this.c.addAll(emptyList2);
    }

    public final void b(Uri uri, Uri uri2) {
        C1837Od2 a = a(uri);
        C1837Od2 a2 = a(uri2);
        InterfaceC0090As interfaceC0090As = a.a;
        if (interfaceC0090As != a2.a) {
            throw new U14("Cannot rename file across backends");
        }
        interfaceC0090As.c(a.d, a2.d);
    }

    public final C1837Od2 a(Uri uri) {
        List list;
        C0172Bi1 c0172Bi1 = AbstractC0562Ei1.g;
        RV.b(4, "initialCapacity");
        Object[] objArr = new Object[4];
        Pattern pattern = AbstractC4836eE1.a;
        RV.b(4, "initialCapacity");
        Object[] objArr2 = new Object[4];
        String encodedFragment = uri.getEncodedFragment();
        if (!TextUtils.isEmpty(encodedFragment) && encodedFragment.startsWith("transform=")) {
            list = AbstractC0562Ei1.n(new C3966bi3(new C4996ei3(new C3622ai3(new XI("+".charAt(0))), true, ZI.g, Integer.MAX_VALUE), encodedFragment.substring(10)));
        } else {
            list = OL2.j;
        }
        C0172Bi1 listIterator = list.listIterator(0);
        int i = 0;
        while (listIterator.hasNext()) {
            String str = (String) listIterator.next();
            Matcher matcher = AbstractC4836eE1.a.matcher(str);
            if (!matcher.matches()) {
                throw new IllegalArgumentException(AbstractC4809e90.a("Invalid fragment spec: ", str));
            }
            String group = matcher.group(1);
            int i2 = i + 1;
            if (objArr2.length < i2) {
                objArr2 = Arrays.copyOf(objArr2, AbstractC11518xi1.b(objArr2.length, i2));
            }
            objArr2[i] = group;
            i = i2;
        }
        C0172Bi1 listIterator2 = AbstractC0562Ei1.m(i, objArr2).listIterator(0);
        if (listIterator2.hasNext()) {
            String str2 = (String) listIterator2.next();
            X5.a(this.b.get(str2));
            throw new U14(IR0.a("No such transform: ", str2, ": ", String.valueOf(uri)));
        }
        AbstractC0562Ei1 t = AbstractC0562Ei1.m(0, objArr).t();
        C1707Nd2 c1707Nd2 = new C1707Nd2();
        String scheme = uri.getScheme();
        InterfaceC0090As interfaceC0090As = (InterfaceC0090As) this.a.get(scheme);
        if (interfaceC0090As != null) {
            c1707Nd2.a = interfaceC0090As;
            c1707Nd2.c = this.c;
            c1707Nd2.b = t;
            if (!t.isEmpty()) {
                ArrayList arrayList = new ArrayList(uri.getPathSegments());
                if (!arrayList.isEmpty() && !uri.getPath().endsWith("/")) {
                    String str3 = (String) arrayList.get(arrayList.size() - 1);
                    C0172Bi1 listIterator3 = t.listIterator(t.size());
                    if (listIterator3.hasPrevious()) {
                        X5.a(listIterator3.previous());
                        throw null;
                    }
                    arrayList.set(arrayList.size() - 1, str3);
                    uri = uri.buildUpon().path(TextUtils.join("/", arrayList)).encodedFragment(null).build();
                }
            }
            c1707Nd2.d = uri;
            return new C1837Od2(c1707Nd2);
        }
        throw new U14(String.format("Cannot open, unregistered backend: %s", scheme));
    }
}
