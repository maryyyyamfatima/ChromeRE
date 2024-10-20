package defpackage;

import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gA2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5505gA2 extends PrintDocumentAdapter {
    public InterfaceC4474dA2 a;

    @Override // android.print.PrintDocumentAdapter
    public final void onStart() {
        ((C6879kA2) this.a).l = 0;
    }

    @Override // android.print.PrintDocumentAdapter
    public final void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
        InterfaceC4474dA2 interfaceC4474dA2 = this.a;
        C4130cA2 c4130cA2 = new C4130cA2(layoutResultCallback);
        C6879kA2 c6879kA2 = (C6879kA2) interfaceC4474dA2;
        c6879kA2.getClass();
        c6879kA2.e = printAttributes2.getResolution().getHorizontalDpi();
        c6879kA2.f = printAttributes2.getMediaSize();
        c6879kA2.i = c4130cA2;
        if (c6879kA2.l == 1) {
            layoutResultCallback.onLayoutFailed(c6879kA2.a);
            c6879kA2.h = null;
            c6879kA2.i = null;
        } else {
            ((C4130cA2) c6879kA2.i).a.onLayoutFinished(new PrintDocumentInfo.Builder(c6879kA2.j.getTitle()).setContentType(0).setPageCount(-1).build(), true);
        }
    }

    @Override // android.print.PrintDocumentAdapter
    public final void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
        int[] iArr;
        InterfaceC4474dA2 interfaceC4474dA2 = this.a;
        C5161fA2 c5161fA2 = new C5161fA2(writeResultCallback);
        C6879kA2 c6879kA2 = (C6879kA2) interfaceC4474dA2;
        c6879kA2.getClass();
        if (pageRangeArr == null || pageRangeArr.length == 0) {
            writeResultCallback.onWriteFailed(null);
            return;
        }
        c6879kA2.h = c5161fA2;
        try {
            c6879kA2.d = parcelFileDescriptor.dup();
            if (pageRangeArr.length == 1 && pageRangeArr[0].equals(PageRange.ALL_PAGES)) {
                iArr = null;
            } else {
                ArrayList arrayList = new ArrayList();
                for (PageRange pageRange : pageRangeArr) {
                    for (int start = pageRange.getStart(); start <= pageRange.getEnd(); start++) {
                        arrayList.add(Integer.valueOf(start));
                    }
                }
                int size = arrayList.size();
                iArr = new int[size];
                Iterator it = arrayList.iterator();
                for (int i = 0; i < size; i++) {
                    iArr[i] = ((Integer) it.next()).intValue();
                }
            }
            c6879kA2.g = iArr;
            if (c6879kA2.j.c(c6879kA2.b, c6879kA2.c)) {
                c6879kA2.l = 1;
                return;
            }
            ((C5161fA2) c6879kA2.h).a.onWriteFailed(c6879kA2.a);
            c6879kA2.h = null;
            c6879kA2.i = null;
        } catch (IOException e) {
            ((C5161fA2) c6879kA2.h).a.onWriteFailed("ParcelFileDescriptor.dup() failed: " + e.toString());
            c6879kA2.h = null;
            c6879kA2.i = null;
        }
    }

    @Override // android.print.PrintDocumentAdapter
    public final void onFinish() {
        super.onFinish();
        C6879kA2 c6879kA2 = (C6879kA2) this.a;
        c6879kA2.g = null;
        c6879kA2.b = -1;
        c6879kA2.c = -1;
        c6879kA2.l = 2;
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
        c6879kA2.h = null;
        c6879kA2.i = null;
        c6879kA2.m = false;
    }
}
