package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kk3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7070kk3 {
    public HashMap a;
    public HashMap b;
    public HashMap c;
    public HashMap d;
    public HashMap e;
    public HashSet f;
    public HashMap g;

    public C7070kk3(C7070kk3 c7070kk3) {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        HashMap hashMap5;
        if (c7070kk3 == null) {
            return;
        }
        synchronized (this) {
            try {
                synchronized (c7070kk3) {
                    hashMap = c7070kk3.a;
                }
                synchronized (c7070kk3) {
                    hashMap2 = c7070kk3.b;
                }
                synchronized (c7070kk3) {
                    hashMap3 = c7070kk3.d;
                }
                d(hashMap, hashMap2, hashMap3);
                synchronized (c7070kk3) {
                    hashMap4 = c7070kk3.e;
                }
                b(hashMap4);
                synchronized (c7070kk3) {
                    hashMap5 = c7070kk3.c;
                }
                if (hashMap5 != null && !hashMap5.isEmpty()) {
                    synchronized (this) {
                        synchronized (this) {
                            if (this.c == null) {
                                this.c = new HashMap();
                            }
                            this.c.putAll(hashMap5);
                        }
                    }
                }
                if (c7070kk3.g != null) {
                    this.g = new HashMap(c7070kk3.g);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void g(String str, C6383ik3 c6383ik3, boolean z) {
        f();
        HashMap hashMap = this.a;
        List list = (List) hashMap.get(str);
        if (list == null) {
            list = e(null);
            hashMap.put(str, list);
        }
        list.add(c6383ik3);
        if (z) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = new HashMap(4);
                }
                HashMap hashMap2 = this.b;
                List list2 = (List) hashMap2.get(str);
                if (list2 == null) {
                    list2 = e(null);
                    hashMap2.put(str, list2);
                }
                list2.add(c6383ik3);
            }
        }
    }

    public static ArrayList e(List list) {
        ArrayList arrayList = new ArrayList(list == null ? 4 : list.size());
        if (list != null) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    public final void a(C7070kk3 c7070kk3) {
        HashMap hashMap;
        List list;
        List list2;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        synchronized (c7070kk3) {
            hashMap = c7070kk3.d;
        }
        synchronized (this) {
            if (hashMap != null) {
                HashMap hashMap5 = this.a;
                if (hashMap5 != null && !hashMap5.isEmpty()) {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        String str = (String) entry.getKey();
                        synchronized (this) {
                            list = (List) this.a.get(str);
                            HashMap hashMap6 = this.b;
                            list2 = hashMap6 == null ? null : (List) hashMap6.get(str);
                        }
                        if (list != null) {
                            List list3 = (List) entry.getValue();
                            if (list.size() == list3.size()) {
                                synchronized (this) {
                                    this.a.remove(str);
                                    HashMap hashMap7 = this.b;
                                    if (hashMap7 != null) {
                                        hashMap7.remove(str);
                                    }
                                }
                            } else {
                                list.removeAll(list3);
                                if (list2 != null) {
                                    list2.removeAll(list3);
                                }
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = c7070kk3.f;
        ArrayList arrayList = new ArrayList();
        if (hashSet != null && (hashMap4 = c7070kk3.e) != null) {
            arrayList.addAll(hashMap4.keySet());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (!hashSet.contains(str2)) {
                    c7070kk3.e.remove(str2);
                }
            }
        }
        synchronized (c7070kk3) {
            hashMap2 = c7070kk3.e;
        }
        b(hashMap2);
        synchronized (c7070kk3) {
            hashMap3 = c7070kk3.c;
        }
        if (hashMap3 != null && !hashMap3.isEmpty()) {
            synchronized (this) {
                synchronized (this) {
                    if (this.c == null) {
                        this.c = new HashMap();
                    }
                }
            }
            this.c.putAll(hashMap3);
        }
        HashMap hashMap8 = this.g;
        if (hashMap8 != null) {
            hashMap8.clear();
        }
        HashMap hashMap9 = c7070kk3.g;
        if (hashMap9 == null || hashMap9.isEmpty()) {
            return;
        }
        HashMap hashMap10 = this.g;
        if (hashMap10 == null) {
            this.g = new HashMap(c7070kk3.g);
        } else {
            hashMap10.putAll(c7070kk3.g);
        }
    }

    public final void d(HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        if ((hashMap == null || hashMap.isEmpty()) && (hashMap3 == null || hashMap3.isEmpty())) {
            return;
        }
        f();
        synchronized (this) {
            if (hashMap != null) {
                try {
                    for (String str : hashMap.keySet()) {
                        this.a.put(str, e((List) hashMap.get(str)));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c(hashMap2);
            if (hashMap3 != null) {
                for (Map.Entry entry : hashMap3.entrySet()) {
                    this.d.put((String) entry.getKey(), e((List) entry.getValue()));
                }
            }
        }
    }

    public final void c(HashMap hashMap) {
        if (hashMap == null || hashMap.isEmpty()) {
            return;
        }
        synchronized (this) {
            if (this.b == null) {
                this.b = new HashMap(4);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            this.b.put((String) entry.getKey(), e((List) entry.getValue()));
        }
    }

    public final void b(HashMap hashMap) {
        if (hashMap == null || hashMap.isEmpty()) {
            return;
        }
        synchronized (this) {
            try {
                synchronized (this) {
                    if (this.e == null) {
                        this.e = new HashMap(4);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.e.clear();
        this.e.putAll(hashMap);
    }

    public final synchronized void f() {
        if (this.a == null) {
            this.a = new HashMap(4);
        }
        if (this.d == null) {
            this.d = new HashMap(4);
        }
    }
}
