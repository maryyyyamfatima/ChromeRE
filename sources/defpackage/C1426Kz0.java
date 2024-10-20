package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Kz0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1426Kz0 extends AbstractC1555Lz0 {
    public final TextView a;
    public final C0126Az0 b;
    public boolean c = true;

    public C1426Kz0(TextView textView) {
        this.a = textView;
        this.b = new C0126Az0(textView);
    }

    @Override // defpackage.AbstractC1555Lz0
    public final void c(boolean z) {
        if (z) {
            TextView textView = this.a;
            textView.setTransformationMethod(e(textView.getTransformationMethod()));
        }
    }

    @Override // defpackage.AbstractC1555Lz0
    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        if (this.c) {
            int length = inputFilterArr.length;
            int i = 0;
            while (true) {
                C0126Az0 c0126Az0 = this.b;
                if (i < length) {
                    if (inputFilterArr[i] == c0126Az0) {
                        return inputFilterArr;
                    }
                    i++;
                } else {
                    InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
                    System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
                    inputFilterArr2[length] = c0126Az0;
                    return inputFilterArr2;
                }
            }
        } else {
            SparseArray sparseArray = new SparseArray(1);
            for (int i2 = 0; i2 < inputFilterArr.length; i2++) {
                InputFilter inputFilter = inputFilterArr[i2];
                if (inputFilter instanceof C0126Az0) {
                    sparseArray.put(i2, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length2 = inputFilterArr.length;
            InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i3 = 0;
            for (int i4 = 0; i4 < length2; i4++) {
                if (sparseArray.indexOfKey(i4) < 0) {
                    inputFilterArr3[i3] = inputFilterArr[i4];
                    i3++;
                }
            }
            return inputFilterArr3;
        }
    }

    @Override // defpackage.AbstractC1555Lz0
    public final TransformationMethod e(TransformationMethod transformationMethod) {
        return this.c ? ((transformationMethod instanceof C2335Rz0) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new C2335Rz0(transformationMethod) : transformationMethod instanceof C2335Rz0 ? ((C2335Rz0) transformationMethod).a : transformationMethod;
    }

    @Override // defpackage.AbstractC1555Lz0
    public final void d(boolean z) {
        this.c = z;
        TextView textView = this.a;
        textView.setTransformationMethod(e(textView.getTransformationMethod()));
        textView.setFilters(a(textView.getFilters()));
    }

    @Override // defpackage.AbstractC1555Lz0
    public final boolean b() {
        return this.c;
    }
}
