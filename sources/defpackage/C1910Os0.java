package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.chromium.chrome.browser.app.ChromeActivity;
import org.chromium.chrome.browser.download.MimeUtils;
import org.chromium.components.offline_items_collection.OfflineItem;
import org.chromium.components.offline_items_collection.UpdateDelta;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Os0 */
/* loaded from: classes.dex */
public final class C1910Os0 implements InterfaceC1303Ka2 {
    public final Handler a;
    public final LinkedHashMap g;
    public final HashSet h;
    public final HashSet i;
    public final HashSet j;
    public final HashMap k;
    public int l;
    public RunnableC0611Es0 m;
    public C1780Ns0 n;
    public final C2040Ps0 o;
    public PropertyModel p;
    public RunnableC1391Ks0 q;

    public final Context g() {
        return (Context) this.o.a.get();
    }

    public final InterfaceC4578dV1 i() {
        C10285u6 c10285u6;
        ChromeActivity chromeActivity = (ChromeActivity) this.o.a.get();
        if (chromeActivity == null || (c10285u6 = chromeActivity.H) == null) {
            return null;
        }
        return AbstractC5609gV1.a(c10285u6);
    }

    public C1910Os0(C2040Ps0 c2040Ps0) {
        Handler handler = new Handler();
        this.a = handler;
        this.g = new LinkedHashMap();
        this.h = new HashSet();
        this.i = new HashSet();
        this.j = new HashSet();
        this.k = new HashMap();
        this.l = 0;
        this.o = c2040Ps0;
        handler.post(new Runnable() { // from class: Fs0
            @Override // java.lang.Runnable
            public final void run() {
                C1910Os0 c1910Os0 = C1910Os0.this;
                c1910Os0.getClass();
                AbstractC0653Fa2.a().b.a(c1910Os0);
            }
        });
    }

    @Override // defpackage.InterfaceC1303Ka2
    public final void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            OfflineItem offlineItem = (OfflineItem) it.next();
            if (j(offlineItem)) {
                c(offlineItem, false, false, false);
            }
        }
    }

    @Override // defpackage.InterfaceC1303Ka2
    public final void e(C6161i50 c6161i50) {
        if (this.h.contains(c6161i50)) {
            this.g.remove(c6161i50);
            this.k.remove(c6161i50);
            c(null, false, false, true);
        }
    }

    @Override // defpackage.InterfaceC1303Ka2
    public final void d(OfflineItem offlineItem, UpdateDelta updateDelta) {
        HashSet hashSet = this.j;
        if (hashSet.contains(offlineItem.y)) {
            hashSet.remove(offlineItem.y);
            this.i.add(offlineItem.a);
        }
        if (j(offlineItem)) {
            if (updateDelta == null || updateDelta.a || offlineItem.B != 2) {
                if (offlineItem.B == 3) {
                    e(offlineItem.a);
                } else {
                    c(offlineItem, false, false, false);
                }
            }
        }
    }

    public static boolean j(OfflineItem offlineItem) {
        if (offlineItem.j || offlineItem.k || offlineItem.H) {
            return false;
        }
        return ((AbstractC8531oz1.b(offlineItem.a) && TextUtils.isEmpty(offlineItem.v)) || MimeUtils.canAutoOpenMimeType(offlineItem.w)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:242:0x014f, code lost:            if (r10 > 0) goto L1367;     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x00ba, code lost:            if (r29 == false) goto L1317;     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x00c0, code lost:            if (r8.size() != 0) goto L1317;     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x00ce, code lost:            r11 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x00cc, code lost:            if (r1.a == 0) goto L1312;     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x00d4, code lost:            if (r2 != false) goto L1316;     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0097, code lost:            if (r11 != 3) goto L1317;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:229:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0172  */
    /* JADX WARN: Type inference failed for: r1v79, types: [Es0, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v29, types: [Ks0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(org.chromium.components.offline_items_collection.OfflineItem r26, boolean r27, boolean r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 1222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1910Os0.c(org.chromium.components.offline_items_collection.OfflineItem, boolean, boolean, boolean):void");
    }

    public final C1650Ms0 h() {
        C1650Ms0 c1650Ms0 = new C1650Ms0();
        for (OfflineItem offlineItem : this.g.values()) {
            if (offlineItem.K != null) {
                c1650Ms0.e++;
            } else {
                int i = offlineItem.B;
                if (i == 0) {
                    c1650Ms0.a++;
                } else if (i == 1) {
                    c1650Ms0.b++;
                } else if (i == 2) {
                    c1650Ms0.d++;
                } else if (i != 3 && i == 5) {
                    c1650Ms0.c++;
                }
            }
        }
        return c1650Ms0;
    }

    public final void a(Integer... numArr) {
        HashSet hashSet = new HashSet(Arrays.asList(numArr));
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = this.g;
        for (C6161i50 c6161i50 : linkedHashMap.keySet()) {
            OfflineItem offlineItem = (OfflineItem) linkedHashMap.get(c6161i50);
            if (offlineItem != null) {
                Iterator it = hashSet.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((Integer) it.next()).intValue() == f(offlineItem)) {
                            arrayList.add(c6161i50);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C6161i50 c6161i502 = (C6161i50) it2.next();
            linkedHashMap.remove(c6161i502);
            this.k.remove(c6161i502);
        }
    }

    public static int f(OfflineItem offlineItem) {
        if (offlineItem.K != null) {
            return 3;
        }
        int i = offlineItem.B;
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 5 ? -1 : 1;
        }
        return 0;
    }
}
