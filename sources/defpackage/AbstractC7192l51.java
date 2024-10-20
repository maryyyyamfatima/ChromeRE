package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: l51, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7192l51 {
    public static HashMap f;
    public static Object k;
    public static boolean l;
    public static final Uri a = Uri.parse("content://com.google.android.gsf.gservices");
    public static final Uri b = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    public static final AtomicBoolean e = new AtomicBoolean();
    public static final HashMap g = new HashMap();
    public static final HashMap h = new HashMap();
    public static final HashMap i = new HashMap();
    public static final HashMap j = new HashMap();
    public static String[] m = new String[0];

    public static void c(ContentResolver contentResolver) {
        HashMap hashMap = f;
        AtomicBoolean atomicBoolean = e;
        if (hashMap == null) {
            atomicBoolean.set(false);
            f = new HashMap();
            k = new Object();
            l = false;
            contentResolver.registerContentObserver(a, true, new C6848k51());
            return;
        }
        if (atomicBoolean.getAndSet(false)) {
            f.clear();
            g.clear();
            h.clear();
            i.clear();
            j.clear();
            k = new Object();
            l = false;
        }
    }

    public static String f(ContentResolver contentResolver, String str, String str2) {
        synchronized (AbstractC7192l51.class) {
            c(contentResolver);
            Object obj = k;
            if (f.containsKey(str)) {
                String str3 = (String) f.get(str);
                if (str3 != null) {
                    str2 = str3;
                }
                return str2;
            }
            for (String str4 : m) {
                if (str.startsWith(str4)) {
                    if (!l || f.isEmpty()) {
                        b(contentResolver, m);
                        if (f.containsKey(str)) {
                            String str5 = (String) f.get(str);
                            if (str5 != null) {
                                str2 = str5;
                            }
                            return str2;
                        }
                    }
                    return str2;
                }
            }
            Cursor query = contentResolver.query(a, null, null, new String[]{str}, null);
            if (query == null) {
                if (query != null) {
                }
                return str2;
            }
            try {
                if (!query.moveToFirst()) {
                    synchronized (AbstractC7192l51.class) {
                        if (obj == k) {
                            f.put(str, null);
                        }
                    }
                    return str2;
                }
                String string = query.getString(1);
                if (string != null && string.equals(str2)) {
                    string = str2;
                }
                synchronized (AbstractC7192l51.class) {
                    if (obj == k) {
                        f.put(str, string);
                    }
                }
                if (string != null) {
                    str2 = string;
                }
                return str2;
            } finally {
            }
            query.close();
        }
    }

    public static String[] a(String[] strArr) {
        HashSet hashSet = new HashSet((((m.length + strArr.length) * 4) / 3) + 1);
        hashSet.addAll(Arrays.asList(m));
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (hashSet.add(str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return new String[0];
        }
        m = (String[]) hashSet.toArray(new String[hashSet.size()]);
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static void b(ContentResolver contentResolver, String[] strArr) {
        HashMap hashMap = f;
        Cursor query = contentResolver.query(b, null, null, strArr, null);
        TreeMap treeMap = new TreeMap();
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    treeMap.put(query.getString(0), query.getString(1));
                } finally {
                    query.close();
                }
            }
        }
        hashMap.putAll(treeMap);
        l = true;
    }

    public static boolean d(ContentResolver contentResolver, String str, boolean z) {
        Object obj;
        synchronized (AbstractC7192l51.class) {
            c(contentResolver);
            obj = k;
        }
        HashMap hashMap = g;
        Boolean bool = (Boolean) g(hashMap, str, Boolean.valueOf(z));
        if (bool == null) {
            String f2 = f(contentResolver, str, null);
            if (f2 != null && !f2.equals("")) {
                if (c.matcher(f2).matches()) {
                    bool = Boolean.TRUE;
                    z = true;
                } else if (d.matcher(f2).matches()) {
                    bool = Boolean.FALSE;
                    z = false;
                } else {
                    Log.w("Gservices", KR0.a("attempt to read gservices key ", str, " (value \"", f2, "\") as boolean"));
                }
            }
            h(obj, hashMap, str, bool);
            return z;
        }
        return bool.booleanValue();
    }

    public static long e(ContentResolver contentResolver, String str) {
        Object obj;
        synchronized (AbstractC7192l51.class) {
            c(contentResolver);
            obj = k;
        }
        HashMap hashMap = i;
        long j2 = 0;
        Long l2 = (Long) g(hashMap, str, 0L);
        if (l2 == null) {
            String f2 = f(contentResolver, str, null);
            if (f2 != null) {
                try {
                    long parseLong = Long.parseLong(f2);
                    l2 = Long.valueOf(parseLong);
                    j2 = parseLong;
                } catch (NumberFormatException unused) {
                }
            }
            h(obj, hashMap, str, l2);
            return j2;
        }
        return l2.longValue();
    }

    public static Object g(HashMap hashMap, String str, Object obj) {
        synchronized (AbstractC7192l51.class) {
            if (!hashMap.containsKey(str)) {
                return null;
            }
            Object obj2 = hashMap.get(str);
            if (obj2 != null) {
                obj = obj2;
            }
            return obj;
        }
    }

    public static void h(Object obj, HashMap hashMap, String str, Object obj2) {
        synchronized (AbstractC7192l51.class) {
            if (obj == k) {
                hashMap.put(str, obj2);
                f.remove(str);
            }
        }
    }
}
