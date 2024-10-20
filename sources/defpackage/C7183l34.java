package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import java.util.ArrayList;
import org.chromium.base.Callback;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: l34 */
/* loaded from: classes.dex */
public final class C7183l34 implements InterfaceC3747b34, InterfaceC4090c34, TextWatcher {
    public final PropertyModel a;
    public Callback g;
    public boolean h;
    public C6153i34 i;
    public int j = 0;
    public int k = 0;
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();

    public C7183l34(C4777e34 c4777e34, PropertyModel propertyModel) {
        this.a = propertyModel;
        this.g = c4777e34;
        propertyModel.o(AbstractC8215o34.e, new Callback() { // from class: k34
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                C7183l34 c7183l34 = C7183l34.this;
                c7183l34.h = booleanValue;
                LD2 ld2 = AbstractC8215o34.b;
                PropertyModel propertyModel2 = c7183l34.a;
                if (propertyModel2.j(ld2)) {
                    propertyModel2.k(AbstractC8215o34.f, c7183l34.h);
                }
                PD2 pd2 = AbstractC8215o34.h;
                C7871n34 c7871n34 = (C7871n34) propertyModel2.i(pd2);
                c7183l34.g.onResult(Boolean.valueOf(booleanValue));
                boolean z = propertyModel2.i(pd2) != c7871n34;
                if (c7183l34.i == null || z) {
                    return;
                }
                c7183l34.b();
            }
        });
        propertyModel.k(AbstractC8215o34.f, false);
        propertyModel.o(AbstractC8215o34.g, this);
        propertyModel.o(AbstractC8215o34.j, this);
        propertyModel.o(AbstractC8215o34.k, this);
        ND2 nd2 = AbstractC8215o34.l;
        propertyModel.h(nd2);
        propertyModel.m(nd2, 3);
    }

    public final void b() {
        CharSequence charSequence;
        String str;
        boolean z = this.h;
        C6153i34 c6153i34 = this.i;
        if (z) {
            String str2 = c6153i34.c;
            charSequence = str2 != null ? str2 : c6153i34.b;
        } else {
            charSequence = c6153i34.b;
        }
        CharSequence charSequence2 = (z || TextUtils.isEmpty(charSequence) || (str = this.i.a) == null) ? charSequence : str;
        int i = this.h ? 0 : this.j;
        if (charSequence == null) {
            charSequence = "";
        }
        this.a.o(AbstractC8215o34.h, new C7871n34(i, this.i.e, this.k, charSequence, charSequence2));
    }

    @Override // defpackage.InterfaceC4090c34
    public final void a(String str, String str2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.l;
            if (i >= arrayList.size()) {
                return;
            }
            ((InterfaceC4090c34) arrayList.get(i)).a(str, str2);
            i++;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.m;
            if (i4 >= arrayList.size()) {
                return;
            }
            ((TextWatcher) arrayList.get(i4)).beforeTextChanged(charSequence, i, i2, i3);
            i4++;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.m;
            if (i4 >= arrayList.size()) {
                return;
            }
            ((TextWatcher) arrayList.get(i4)).onTextChanged(charSequence, i, i2, i3);
            i4++;
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.m;
            if (i >= arrayList.size()) {
                return;
            }
            ((TextWatcher) arrayList.get(i)).afterTextChanged(editable);
            i++;
        }
    }
}
