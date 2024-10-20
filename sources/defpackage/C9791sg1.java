package defpackage;

import J.N;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.firebase.appindexing.internal.MutateRequest;
import com.google.firebase.appindexing.internal.Thing;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.historyreport.DeltaFileEntry;
import org.chromium.chrome.browser.historyreport.HistoryReportJniBridge;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.signin.base.CoreAccountInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sg1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9791sg1 {
    public static final long e = TimeUnit.SECONDS.toMillis(30);
    public static boolean f;
    public static volatile C9791sg1 g;
    public final InterfaceC5446g03 a;
    public final AtomicBoolean b;
    public final ScheduledThreadPoolExecutor c;
    public final long d;

    public C9791sg1(InterfaceC5446g03 interfaceC5446g03) {
        long j = e;
        this.a = interfaceC5446g03;
        this.b = new AtomicBoolean();
        this.c = new ScheduledThreadPoolExecutor(1);
        this.d = j;
        f = false;
        g = this;
    }

    public final void a(boolean z) {
        long j;
        DeltaFileEntry[] deltaFileEntryArr;
        ArrayList arrayList;
        int i;
        HistoryReportJniBridge historyReportJniBridge;
        ArrayList arrayList2;
        Object obj = ThreadUtils.a;
        SharedPreferences sharedPreferences = V60.a.getSharedPreferences("icing_firebase_pref", 0);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        long j2 = sharedPreferences.getLong("LastSeqno", 0L);
        if (z) {
            j2 = 0;
        }
        C1202Jg1 a = C1202Jg1.a();
        Profile d = Profile.d();
        a.getClass();
        String b = CoreAccountInfo.b(C1202Jg1.b(d).b(1));
        HistoryReportJniBridge historyReportJniBridge2 = (HistoryReportJniBridge) this.a;
        DeltaFileEntry[] b2 = historyReportJniBridge2.b(1000, j2);
        int length = b2.length;
        long j3 = -1;
        int i2 = 0;
        while (i2 < length) {
            DeltaFileEntry deltaFileEntry = b2[i2];
            ArrayList arrayList5 = arrayList4;
            long max = Math.max(j3, deltaFileEntry.a);
            String str = deltaFileEntry.d;
            if (str.length() > 256) {
                arrayList2 = arrayList5;
            } else if (deltaFileEntry.b.equals("del")) {
                arrayList2 = arrayList5;
                arrayList2.add(str);
            } else {
                Vm4 vm4 = new Vm4();
                BreakIterator wordInstance = BreakIterator.getWordInstance();
                String str2 = deltaFileEntry.f;
                wordInstance.setText(str2);
                int i3 = 8;
                j = max;
                int i4 = 0;
                while (i4 != -1 && i3 > 0) {
                    int next = wordInstance.next();
                    while (true) {
                        if (i4 >= next) {
                            break;
                        }
                        if (Character.isLetterOrDigit(str2.codePointAt(i4))) {
                            i3--;
                            break;
                        }
                        i4++;
                    }
                    i4 = next;
                }
                deltaFileEntryArr = b2;
                vm4.c("name", str2.substring(0, wordInstance.current()));
                vm4.d = str;
                vm4.c("sameAs", T34.n(str));
                vm4.c("alternateName", str2);
                if (b != null) {
                    C9009qO0 c9009qO0 = C9009qO0.n;
                    arrayList = arrayList5;
                    i = i2;
                    historyReportJniBridge = historyReportJniBridge2;
                    vm4.c = new Thing.Metadata(c9009qO0.k, c9009qO0.l, b, new Bundle(), null);
                } else {
                    arrayList = arrayList5;
                    i = i2;
                    historyReportJniBridge = historyReportJniBridge2;
                }
                arrayList3.add(vm4.a());
                i2 = i + 1;
                b2 = deltaFileEntryArr;
                historyReportJniBridge2 = historyReportJniBridge;
                j3 = j;
                arrayList4 = arrayList;
            }
            j = max;
            deltaFileEntryArr = b2;
            arrayList = arrayList2;
            i = i2;
            historyReportJniBridge = historyReportJniBridge2;
            i2 = i + 1;
            b2 = deltaFileEntryArr;
            historyReportJniBridge2 = historyReportJniBridge;
            j3 = j;
            arrayList4 = arrayList;
        }
        ArrayList arrayList6 = arrayList4;
        HistoryReportJniBridge historyReportJniBridge3 = historyReportJniBridge2;
        if (arrayList3.size() > 0) {
            C8666pO0.a(V60.a).c((InterfaceC4325cl1[]) arrayList3.toArray(new InterfaceC4325cl1[0]));
            arrayList3.size();
        }
        if (arrayList6.size() > 0) {
            C8666pO0.a(V60.a).b(new MutateRequest(3, null, (String[]) arrayList6.toArray(new String[0]), null, null, null, null));
            arrayList6.size();
        }
        if (j3 > 0) {
            sharedPreferences.edit().putLong("LastSeqno", j3).apply();
            historyReportJniBridge3.getClass();
            Object obj2 = ThreadUtils.a;
            if (!historyReportJniBridge3.a()) {
                AbstractC4851eH1.f("historyreport", "trimDeltaFile when JNI bridge not initialized", new Object[0]);
            } else {
                N.Mao2fV_W(historyReportJniBridge3.a, historyReportJniBridge3, j3);
            }
        }
        if (f) {
            return;
        }
        historyReportJniBridge3.getClass();
        Object obj3 = ThreadUtils.a;
        if (!historyReportJniBridge3.a()) {
            AbstractC4851eH1.f("historyreport", "clearUsageReports when JNI bridge not initialized", new Object[0]);
        } else {
            N.M6zbYlIM(historyReportJniBridge3.a, historyReportJniBridge3);
        }
        f = true;
    }
}
