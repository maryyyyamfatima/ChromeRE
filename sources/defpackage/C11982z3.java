package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.chromium.base.Callback;
import org.chromium.components.signin.AccountManagerFacade;
import org.chromium.components.signin.AccountManagerFacadeProvider;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: z3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11982z3 implements F4, InterfaceC9979tC2 {
    public final C7616mK1 a;
    public final InterfaceC9238r3 g;
    public final C10322uC2 h;
    public final AccountManagerFacade i;

    public C11982z3(Context context, C7616mK1 c7616mK1, InterfaceC9238r3 interfaceC9238r3) {
        this.a = c7616mK1;
        this.g = interfaceC9238r3;
        C10322uC2 b = C10322uC2.b(context);
        this.h = b;
        AccountManagerFacade accountManagerFacadeProvider = AccountManagerFacadeProvider.getInstance();
        this.i = accountManagerFacadeProvider;
        accountManagerFacadeProvider.b(this);
        b.a(this);
        a(B4.e(accountManagerFacadeProvider.a()));
    }

    @Override // defpackage.F4
    public final void E() {
        this.i.a().g(new Callback() { // from class: y3
            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C11982z3.this.a((List) obj);
            }

            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }
        });
    }

    @Override // defpackage.InterfaceC9979tC2
    public final void u(String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            C7272lK1 c7272lK1 = (C7272lK1) it.next();
            if (c7272lK1.a == 1) {
                PD2 pd2 = C3.a;
                PropertyModel propertyModel = c7272lK1.b;
                if (TextUtils.equals(str, ((C6073hq0) propertyModel.i(pd2)).a)) {
                    propertyModel.o(pd2, this.h.c(str));
                    return;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [x3] */
    public final void a(List list) {
        C7616mK1 c7616mK1 = this.a;
        c7616mK1.clear();
        Callback callback = new Callback() { // from class: w3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C11982z3 c11982z3 = C11982z3.this;
                c11982z3.getClass();
                c11982z3.g.k(((C6073hq0) obj).a);
            }
        };
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C6073hq0 c = this.h.c(((Account) it.next()).name);
            HashMap e = PropertyModel.e(C3.c);
            PD2 pd2 = C3.a;
            GD2 gd2 = new GD2();
            gd2.a = c;
            e.put(pd2, gd2);
            JD2 jd2 = C3.b;
            GD2 gd22 = new GD2();
            gd22.a = callback;
            c7616mK1.s(new C7272lK1(1, AbstractC1996Pj1.a(e, jd2, gd22, e)));
        }
        final InterfaceC9238r3 interfaceC9238r3 = this.g;
        Objects.requireNonNull(interfaceC9238r3);
        final ?? r1 = new Runnable() { // from class: x3
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC9238r3.this.s();
            }
        };
        HashMap e2 = PropertyModel.e(B3.b);
        JD2 jd22 = B3.a;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: A3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r1.run();
            }
        };
        GD2 gd23 = new GD2();
        gd23.a = onClickListener;
        c7616mK1.s(new C7272lK1(2, AbstractC1996Pj1.a(e2, jd22, gd23, e2)));
    }
}
