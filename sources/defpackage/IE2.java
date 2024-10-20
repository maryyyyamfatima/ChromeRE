package defpackage;

import android.content.Context;
import android.os.SystemClock;
import com.android.chrome.R;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class IE2 {
    public static final LinkedHashMap c = new LinkedHashMap();
    public static final Object d = new Object();
    public static boolean e;
    public static ArrayList f;
    public static IE2 g;
    public final Integer a;
    public final WeakReference b;

    public static IE2 b(int i) {
        synchronized (d) {
            IE2 ie2 = (IE2) c.get(Integer.valueOf(i));
            if (ie2 != null) {
                return ie2;
            }
            return new IE2(i);
        }
    }

    public IE2(int i) {
        this.a = Integer.valueOf(i);
        this.b = null;
        c.put(Integer.valueOf(c()), this);
    }

    public static IE2 a(Tab tab) {
        synchronized (d) {
            IE2 ie2 = (IE2) c.get(Integer.valueOf(tab.getId()));
            if (ie2 != null) {
                if (ie2.g() != null) {
                    if (ie2.g() == tab) {
                        return ie2;
                    }
                    return new IE2(tab);
                }
            }
            return new IE2(tab);
        }
    }

    public IE2(Tab tab) {
        this.a = Integer.valueOf(tab.getId());
        this.b = new WeakReference(tab);
        c.put(Integer.valueOf(c()), this);
    }

    public static ArrayList d(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a((Tab) it.next()));
        }
        return arrayList;
    }

    public final String toString() {
        return "Tab " + this.a;
    }

    public final int c() {
        return this.a.intValue();
    }

    public final String i() {
        WeakReference weakReference = this.b;
        if (weakReference != null && weakReference.get() != null && ((Tab) weakReference.get()).isInitialized()) {
            return ((Tab) weakReference.get()).getTitle();
        }
        return C2183Qu3.d().getString(C2183Qu3.f(this.a.intValue()), "");
    }

    public final GURL k() {
        WeakReference weakReference = this.b;
        if (weakReference != null && weakReference.get() != null && ((Tab) weakReference.get()).isInitialized()) {
            return ((Tab) weakReference.get()).getUrl();
        }
        int intValue = this.a.intValue();
        String string = C2183Qu3.d().getString(C2183Qu3.g(intValue), "");
        if (string.isEmpty()) {
            return new GURL(C2183Qu3.d().getString(intValue + "_url", ""));
        }
        return GURL.a(string);
    }

    public final int f() {
        WeakReference weakReference = this.b;
        if (weakReference == null || weakReference.get() == null || !((Tab) weakReference.get()).isInitialized()) {
            return C2183Qu3.d().getInt(C2183Qu3.c(this.a.intValue()), -1);
        }
        return C1695Nb0.m((Tab) weakReference.get()).r;
    }

    public final long h() {
        WeakReference weakReference = this.b;
        if (weakReference == null || weakReference.get() == null || !((Tab) weakReference.get()).isInitialized()) {
            return C2183Qu3.d().getLong(C2183Qu3.e(this.a.intValue()), -1L);
        }
        return C1695Nb0.m((Tab) weakReference.get()).s;
    }

    public final boolean l() {
        WeakReference weakReference = this.b;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        return ((Tab) weakReference.get()).isIncognito();
    }

    public final String j(Context context, C4828eC3 c4828eC3) {
        if (c4828eC3 == null) {
            return i();
        }
        int size = e(context, this, c4828eC3.a).size();
        if (size == 1) {
            return i();
        }
        return c4828eC3.b.getResources().getQuantityString(R.plurals.f62360_resource_name_obfuscated_res_0x7f12000e, size, Integer.valueOf(size));
    }

    public final Tab g() {
        WeakReference weakReference = this.b;
        if (weakReference != null) {
            return (Tab) weakReference.get();
        }
        return null;
    }

    public static ArrayList e(Context context, IE2 ie2, InterfaceC10590uz3 interfaceC10590uz3) {
        List G;
        synchronized (d) {
            int c2 = ie2.c();
            if (((AbstractC11276wz3) interfaceC10590uz3).i) {
                C7502lz3 c7502lz3 = ((AbstractC11276wz3) interfaceC10590uz3).c;
                List G2 = c7502lz3.e(false).G(c2);
                G = G2.size() > 0 ? G2 : c7502lz3.e(true).G(c2);
            } else {
                G = null;
            }
            if (G != null) {
                return d(G);
            }
            ArrayList arrayList = new ArrayList();
            int f2 = ie2.f();
            if (f2 != -1 && AbstractC5177fD3.e(context)) {
                Iterator it = c.keySet().iterator();
                while (it.hasNext()) {
                    IE2 ie22 = (IE2) c.get((Integer) it.next());
                    if (ie22.f() != -1 && ie22.f() == f2) {
                        arrayList.add(ie22);
                    }
                }
                return arrayList;
            }
            arrayList.add(ie2);
            return arrayList;
        }
    }

    public static void m(final Context context) {
        FileInputStream fileInputStream;
        if (e) {
            return;
        }
        e = true;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        File file = new File(OA3.a(), OD3.q(0));
        if (!file.exists()) {
            AbstractC4851eH1.d("PseudoTab", "State file does not exist.", new Object[0]);
            return;
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[(int) file.length()];
                    fileInputStream.read(bArr);
                    AbstractC2663Um3.a(fileInputStream);
                    AbstractC4851eH1.d("PseudoTab", "Finished fetching tab list.", new Object[0]);
                    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
                    final HashSet hashSet = new HashSet();
                    f = new ArrayList();
                    try {
                        C9284rA3.m(dataInputStream, new InterfaceC6880kA3() { // from class: HE2
                            @Override // defpackage.InterfaceC6880kA3
                            public final void a(int i, int i2, Boolean bool, String str, boolean z, boolean z2) {
                                if (!T34.f(str) || z) {
                                    IE2 b = IE2.b(i2);
                                    if (z) {
                                        IE2.g = b;
                                    }
                                    int f2 = b.f();
                                    boolean e2 = AbstractC5177fD3.e(context);
                                    Set set = hashSet;
                                    if (e2 && set.contains(Integer.valueOf(f2))) {
                                        return;
                                    }
                                    IE2.f.add(b);
                                    set.add(Integer.valueOf(f2));
                                }
                            }
                        }, null);
                        Objects.toString(f);
                        AbstractC4851eH1.d("PseudoTab", "readAllPseudoTabsFromStateFile() took %dms", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                    } catch (IOException e2) {
                        AbstractC4851eH1.a("PseudoTab", "Could not read state file.", e2);
                    }
                } catch (IOException e3) {
                    e = e3;
                    fileInputStream2 = fileInputStream;
                    AbstractC4851eH1.a("PseudoTab", "Could not read state file.", e);
                    AbstractC2663Um3.a(fileInputStream2);
                } catch (Throwable th) {
                    th = th;
                    AbstractC2663Um3.a(fileInputStream);
                    throw th;
                }
            } catch (IOException e4) {
                e = e4;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }
}
