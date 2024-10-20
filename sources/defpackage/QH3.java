package defpackage;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import org.chromium.base.Callback;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes5.dex */
public final class QH3 implements TextWatcher, View.OnLayoutChangeListener {
    public final Context a;
    public final PropertyModel g;
    public final Callback h;
    public final EditText i;
    public String j;
    public int k = 0;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public QH3(Context context, PropertyModel propertyModel, EditText editText, C0143Bc2 c0143Bc2, Callback callback) {
        this.a = context;
        this.g = propertyModel;
        this.i = editText;
        this.h = callback;
        if (editText != null) {
            editText.addTextChangedListener(this);
        }
        propertyModel.o(RH3.f, new Runnable() { // from class: MH3
            @Override // java.lang.Runnable
            public final void run() {
                QH3 qh3 = QH3.this;
                InputMethodManager inputMethodManager = (InputMethodManager) qh3.a.getSystemService("input_method");
                EditText editText2 = qh3.i;
                if (inputMethodManager.isActive(editText2)) {
                    inputMethodManager.hideSoftInputFromWindow(editText2.getWindowToken(), 0, null);
                }
                qh3.a();
            }
        });
        propertyModel.o(RH3.g, new Runnable() { // from class: NH3
            @Override // java.lang.Runnable
            public final void run() {
                QH3.this.a();
            }
        });
        propertyModel.o(RH3.h, this);
        if (c0143Bc2 != null) {
            final PH3 ph3 = new PH3(this, propertyModel.j(RH3.a));
            propertyModel.a(new VD2() { // from class: OH3
                @Override // defpackage.VD2
                public final void d(WD2 wd2, Object obj) {
                    FD2 fd2 = (FD2) obj;
                    LD2 ld2 = RH3.a;
                    QH3 qh3 = QH3.this;
                    if (fd2 == ld2) {
                        ph3.a = qh3.g.j(ld2);
                    } else {
                        qh3.getClass();
                    }
                }
            });
            c0143Bc2.b(ph3);
        }
    }

    public final void a() {
        Callback callback = this.h;
        if (callback != null) {
            callback.onResult(Integer.valueOf(this.k));
        }
        PD2 pd2 = RH3.b;
        String str = this.j;
        PropertyModel propertyModel = this.g;
        propertyModel.o(pd2, str);
        propertyModel.k(RH3.a, false);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.k = i3 - i;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.j = editable.toString();
    }
}
