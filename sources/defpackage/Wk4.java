package defpackage;

import J.N;
import android.content.SharedPreferences;
import android.os.Handler;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.base.Callback;
import org.chromium.base.PathUtils;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.webapps.WebApkUpdateDataFetcher;
import org.chromium.components.background_task_scheduler.TaskInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Wk4 implements Qk4, InterfaceC0186Bl0 {
    public static int o;
    public final C6166i6 a;
    public Kn4 g;
    public C8354oU1 h;
    public String i;
    public String j;
    public ArrayList k;
    public C12237zn4 l;
    public WebApkUpdateDataFetcher m;
    public Handler n;

    public Wk4(C6166i6 c6166i6, I5 i5) {
        this.a = c6166i6;
        i5.b(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x01e3, code lost:            if ((android.os.Build.VERSION.SDK_INT >= 26) != false) goto L770;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0268  */
    /* JADX WARN: Type inference failed for: r1v24, types: [zn4] */
    /* JADX WARN: Type inference failed for: r1v26, types: [android.content.SharedPreferences] */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r3v25, types: [android.content.SharedPreferences$Editor] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(defpackage.Mn4 r20, java.lang.String r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 1370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Wk4.h(Mn4, java.lang.String, java.lang.String):void");
    }

    public static String d(C8354oU1 c8354oU1, String str) {
        if (c8354oU1 == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c8354oU1.n());
        sb.append("|");
        sb.append(c8354oU1.p());
        sb.append("|");
        sb.append((String) c8354oU1.h().get(str));
        sb.append(c8354oU1.k() ? "|Adaptive" : "|NotAdaptive");
        return sb.toString();
    }

    public final void j(int i) {
        k(this.l, 1, false);
        if (i == 1 || i == 5) {
            String d = d(this.h, this.i);
            if (!d.isEmpty()) {
                this.l.b.edit().putString("last_update_hash_accepted", d).apply();
            }
            C8354oU1 c8354oU1 = this.h;
            if (c8354oU1 == null) {
                Kn4 kn4 = this.g;
                C7928nE c7928nE = UN.a;
                a(kn4, "", "", true, N.M09VlOh_("PwaUpdateDialogForName") || N.M09VlOh_("PwaUpdateDialogForIcon"), this.k);
            } else {
                String str = this.i;
                String str2 = this.j;
                C7928nE c7928nE2 = UN.a;
                a(c8354oU1, str, str2, false, N.M09VlOh_("PwaUpdateDialogForName") || N.M09VlOh_("PwaUpdateDialogForIcon"), this.k);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [Sk4] */
    public final void a(Kn4 kn4, String str, String str2, boolean z, boolean z2, List list) {
        Kn4 kn42 = this.g;
        C8354oU1 c8354oU1 = this.h;
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("WebApkUniqueId") && c8354oU1 != null) {
            String concat = "WebApk.Update.UniqueId".concat(TextUtils.isEmpty(kn42.e().g) ? "Empty" : "Same");
            EI2.b(AbstractC7848n0.a(concat, ".ManifestUrl"), TextUtils.equals(kn42.m(), c8354oU1.m()));
            EI2.b(concat + ".StartUrl", TextUtils.equals(kn42.s(), c8354oU1.s()));
        }
        ?? r9 = new Callback() { // from class: Sk4
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                TaskInfo taskInfo;
                Wk4 wk4 = Wk4.this;
                wk4.getClass();
                if (((Boolean) obj).booleanValue()) {
                    EI2.h(1, 3, "WebApk.Update.RequestQueued");
                    if (wk4.l.b.getBoolean("should_force_update", false)) {
                        EF3 ef3 = new EF3();
                        ef3.b = 0L;
                        FF3 ff3 = new FF3(ef3);
                        BF3 bf3 = new BF3(91);
                        bf3.g = ff3;
                        bf3.f = true;
                        bf3.e = true;
                        taskInfo = new TaskInfo(bf3);
                        wk4.l.b.edit().putBoolean("update_scheduled", true).apply();
                        wk4.l.b(false);
                    } else {
                        BF3 a = TaskInfo.a(91, 3600000L, 82800000L);
                        a.c = 2;
                        a.f = true;
                        a.e = true;
                        a.d = true;
                        taskInfo = new TaskInfo(a);
                    }
                    AbstractC7808mt.b().b(V60.a, taskInfo);
                    return;
                }
                C12237zn4 c12237zn4 = wk4.l;
                c12237zn4.b(false);
                c12237zn4.b.edit().putBoolean("update_scheduled", false).apply();
                Wk4.k(c12237zn4, 1, false);
                c12237zn4.a();
            }
        };
        C12237zn4 c12237zn4 = this.l;
        c12237zn4.getClass();
        AtomicBoolean atomicBoolean = Fn4.a;
        String path = new File(new File(PathUtils.getCacheDirectory(), "webapk/update"), c12237zn4.a).getPath();
        c12237zn4.b.edit().putString("pending_update_file_path", path).apply();
        new Vk4(this, kn4, path, str, str2, z, z2, list, r9).c(AbstractC0185Bl.e);
    }

    @Override // defpackage.InterfaceC0186Bl0
    public final void onDestroy() {
        WebApkUpdateDataFetcher webApkUpdateDataFetcher = this.m;
        if (webApkUpdateDataFetcher != null) {
            Tab tab = webApkUpdateDataFetcher.g;
            if (tab != null) {
                tab.w(webApkUpdateDataFetcher);
                N.MbkiXMEf(webApkUpdateDataFetcher.a, webApkUpdateDataFetcher);
                webApkUpdateDataFetcher.a = 0L;
            }
            this.m = null;
        }
        Handler handler = this.n;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public static void k(C12237zn4 c12237zn4, int i, boolean z) {
        c12237zn4.b.edit().putLong("last_update_request_complete_time", System.currentTimeMillis()).apply();
        boolean z2 = i == 0;
        SharedPreferences sharedPreferences = c12237zn4.b;
        sharedPreferences.edit().putBoolean("did_last_update_request_succeed", z2).apply();
        sharedPreferences.edit().putBoolean("relax_updates", z).apply();
        if (o == 0) {
            o = N.MXmzBYjM();
        }
        sharedPreferences.edit().putInt("last_requested_shell_apk_version", o).apply();
    }

    public static String b(Map map, String str) {
        for (Map.Entry entry : map.entrySet()) {
            if (T34.p((String) entry.getKey(), str)) {
                return (String) entry.getValue();
            }
        }
        return null;
    }
}
