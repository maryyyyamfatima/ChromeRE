package defpackage;

import J.N;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.base.SysUtils;
import org.chromium.chrome.browser.historyreport.HistoryReportJniBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ug1 */
/* loaded from: classes.dex */
public class C10477ug1 extends AbstractC10828vh3 {
    public static final String[] m = {"seqno", "action", "uri", "doc_score", "section_url", "section_title", "section_indexed_url"};
    public static volatile C10477ug1 n;
    public final AtomicBoolean g;
    public final AtomicBoolean h;
    public final InterfaceC5446g03 i;
    public volatile C9106qg1 j;
    public volatile Context k;
    public volatile boolean l;

    @Override // defpackage.AbstractC10828vh3
    public final void g(AbstractC11171wh3 abstractC11171wh3) {
        this.a = abstractC11171wh3;
        this.k = c();
    }

    public C10477ug1() {
        HistoryReportJniBridge historyReportJniBridge = new HistoryReportJniBridge();
        this.g = new AtomicBoolean();
        this.h = new AtomicBoolean();
        n = this;
        this.i = historyReportJniBridge;
    }

    @Override // defpackage.AbstractC10828vh3
    public final void b(PrintWriter printWriter) {
        if (!(SysUtils.isLowEndDevice() ? false : C4502dG0.b.a(new U44()))) {
            printWriter.append("\nIcingProvider [disabled]");
            return;
        }
        final ConditionVariable conditionVariable = new ConditionVariable();
        conditionVariable.close();
        final String[] strArr = new String[1];
        AbstractC0185Bl.e.execute(new Runnable() { // from class: tg1
            @Override // java.lang.Runnable
            public final void run() {
                C10477ug1 c10477ug1 = C10477ug1.this;
                c10477ug1.getClass();
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter2 = new PrintWriter(stringWriter);
                HistoryReportJniBridge historyReportJniBridge = (HistoryReportJniBridge) c10477ug1.i;
                historyReportJniBridge.getClass();
                printWriter2.append((CharSequence) "\nHistoryReportJniBridge [").append((CharSequence) ("started: " + historyReportJniBridge.c.get())).append((CharSequence) (", initialized: " + historyReportJniBridge.a()));
                if (historyReportJniBridge.a()) {
                    printWriter2.append((CharSequence) (", " + N.MQUkZY_W(historyReportJniBridge.a, historyReportJniBridge)));
                }
                printWriter2.append((CharSequence) "]");
                strArr[0] = stringWriter.toString();
                conditionVariable.open();
            }
        });
        printWriter.append("\nIcingProvider [ jni initialized: " + this.h.get() + ", processing request: " + this.g.get() + "]");
        if (this.j != null) {
            C9106qg1 c9106qg1 = this.j;
            c9106qg1.getClass();
            printWriter.append("\nIcingController [");
            printWriter.append("indexing requested: " + c9106qg1.e.get());
            printWriter.append(", indexing request delay: " + c9106qg1.h);
            printWriter.append(", usage reporting enabled: " + c9106qg1.i.get());
            printWriter.append(", reporting usage: " + c9106qg1.m.get());
            StringBuilder sb = new StringBuilder(", completed tasks: ");
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = c9106qg1.g;
            sb.append(scheduledThreadPoolExecutor.getCompletedTaskCount());
            printWriter.append(sb.toString());
            printWriter.append(", scheduled tasks: " + scheduledThreadPoolExecutor.getTaskCount());
            printWriter.append("]");
        }
        conditionVariable.block();
        printWriter.append((CharSequence) strArr[0]);
    }

    @Override // defpackage.AbstractC10828vh3
    public final String d(Uri uri) {
        AbstractC0810Gg.a(this.k);
        return "vnd.android.cursor.dir/vnd.google.chrome.delta";
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0088 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008e A[Catch: all -> 0x0111, TRY_ENTER, TryCatch #0 {all -> 0x0111, blocks: (B:8:0x0026, B:10:0x002e, B:13:0x0032, B:17:0x0049, B:22:0x0060, B:26:0x003e, B:29:0x0067, B:33:0x0070, B:45:0x008e, B:47:0x00a6, B:49:0x00da, B:51:0x00de, B:53:0x00ec, B:62:0x00fe, B:65:0x0101), top: B:7:0x0026 }] */
    @Override // defpackage.AbstractC10828vh3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.database.MatrixCursor f(android.net.Uri r20, java.lang.String[] r21) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10477ug1.f(android.net.Uri, java.lang.String[]):android.database.MatrixCursor");
    }

    @Override // defpackage.AbstractC10828vh3
    public final Uri e(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.AbstractC10828vh3
    public final int h(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.AbstractC10828vh3
    public final int a(Uri uri) {
        throw new UnsupportedOperationException();
    }
}
