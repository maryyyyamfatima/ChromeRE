package org.chromium.printing;

import J.N;
import android.app.Activity;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import defpackage.C5161fA2;
import defpackage.C5849hA2;
import defpackage.C6879kA2;
import defpackage.InterfaceC6535jA2;
import java.io.IOException;
import org.chromium.base.ThreadUtils;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class PrintingContext {
    public final InterfaceC6535jA2 a = C6879kA2.a();
    public final long b;

    public PrintingContext(long j) {
        this.b = j;
    }

    public static PrintingContext create(long j) {
        Object obj = ThreadUtils.a;
        return new PrintingContext(j);
    }

    public int getFileDescriptor() {
        Object obj = ThreadUtils.a;
        return ((C6879kA2) this.a).d.getFd();
    }

    public int getDpi() {
        Object obj = ThreadUtils.a;
        return ((C6879kA2) this.a).e;
    }

    public int getWidth() {
        Object obj = ThreadUtils.a;
        return ((C6879kA2) this.a).f.getWidthMils();
    }

    public int getHeight() {
        Object obj = ThreadUtils.a;
        return ((C6879kA2) this.a).f.getHeightMils();
    }

    public void showPrintDialog() {
        Object obj = ThreadUtils.a;
        ((C6879kA2) this.a).b();
        N.Mmq2M8tt(this.b, this);
    }

    public static void pdfWritingDone(int i) {
        PageRange[] pageRangeArr;
        Object obj = ThreadUtils.a;
        C6879kA2 c6879kA2 = (C6879kA2) C6879kA2.a();
        if (c6879kA2.l != 1) {
            return;
        }
        c6879kA2.l = 0;
        ParcelFileDescriptor parcelFileDescriptor = c6879kA2.d;
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException unused) {
            } catch (Throwable th) {
                c6879kA2.d = null;
                throw th;
            }
            c6879kA2.d = null;
        }
        if (i > 0) {
            int[] iArr = c6879kA2.g;
            if (iArr != null) {
                int length = iArr.length;
                pageRangeArr = new PageRange[length];
                for (int i2 = 0; i2 < length; i2++) {
                    int i3 = iArr[i2];
                    pageRangeArr[i2] = new PageRange(i3, i3);
                }
            } else {
                pageRangeArr = new PageRange[]{new PageRange(0, i - 1)};
            }
            ((C5161fA2) c6879kA2.h).a.onWriteFinished(pageRangeArr);
            return;
        }
        ((C5161fA2) c6879kA2.h).a.onWriteFailed(c6879kA2.a);
        c6879kA2.h = null;
        c6879kA2.i = null;
    }

    public static void setPendingPrint(WindowAndroid windowAndroid, Printable printable, int i, int i2) {
        Activity activity = (Activity) windowAndroid.k().get();
        if (activity == null) {
            return;
        }
        InterfaceC6535jA2 a = C6879kA2.a();
        C5849hA2 c5849hA2 = new C5849hA2(activity);
        C6879kA2 c6879kA2 = (C6879kA2) a;
        if (c6879kA2.m) {
            return;
        }
        c6879kA2.j = printable;
        c6879kA2.a = printable.a();
        c6879kA2.n = c5849hA2;
        c6879kA2.b = i;
        c6879kA2.c = i2;
    }

    public int[] getPages() {
        Object obj = ThreadUtils.a;
        int[] iArr = ((C6879kA2) this.a).g;
        if (iArr == null) {
            return null;
        }
        return (int[]) iArr.clone();
    }

    public void askUserForSettings(int i) {
        Object obj = ThreadUtils.a;
        InterfaceC6535jA2 interfaceC6535jA2 = this.a;
        boolean z = ((C6879kA2) interfaceC6535jA2).l == 2;
        long j = this.b;
        if (!z) {
            interfaceC6535jA2.getClass();
            N.M8HtOhJl(j, this, true);
        } else {
            N.M8HtOhJl(j, this, false);
        }
    }
}
