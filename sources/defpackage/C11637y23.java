package defpackage;

import J.N;
import android.content.Context;
import android.net.Uri;
import org.chromium.base.ContentUriUtils;
import org.chromium.ui.base.SelectFileDialog;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: y23 */
/* loaded from: classes2.dex */
public final class C11637y23 extends AbstractC0185Bl {
    public String[] h;
    public final Context i;
    public final boolean j;
    public final Uri[] k;
    public final /* synthetic */ SelectFileDialog l;

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        String[] strArr = (String[]) obj;
        SelectFileDialog selectFileDialog = this.l;
        if (strArr == null) {
            String[] strArr2 = SelectFileDialog.q;
            selectFileDialog.m();
        } else {
            if (!this.j) {
                selectFileDialog.n(selectFileDialog.a, this.h[0], strArr[0]);
                return;
            }
            long j = selectFileDialog.a;
            String[] strArr3 = this.h;
            selectFileDialog.o(strArr3);
            N.Mx1807vz(j, selectFileDialog, strArr3, strArr);
        }
    }

    public C11637y23(SelectFileDialog selectFileDialog, Context context, boolean z, Uri[] uriArr) {
        this.l = selectFileDialog;
        this.i = context;
        this.j = z;
        this.k = uriArr;
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        boolean equals;
        Context context;
        Uri[] uriArr = this.k;
        this.h = new String[uriArr.length];
        String[] strArr = new String[uriArr.length];
        for (int i = 0; i < uriArr.length; i++) {
            try {
                equals = "file".equals(uriArr[i].getScheme());
                context = this.i;
            } catch (SecurityException unused) {
                AbstractC4851eH1.f("SelectFileDialog", "Unable to extract results from the content provider", new Object[0]);
            }
            if (equals) {
                if (SelectFileDialog.j(context, uriArr[i].getSchemeSpecificPart())) {
                    return null;
                }
                this.h[i] = uriArr[i].getSchemeSpecificPart();
            } else {
                if ("content".equals(uriArr[i].getScheme()) && SelectFileDialog.i(context, uriArr[i])) {
                    return null;
                }
                this.h[i] = uriArr[i].toString();
            }
            strArr[i] = ContentUriUtils.c(context, uriArr[i]);
        }
        return strArr;
    }
}
