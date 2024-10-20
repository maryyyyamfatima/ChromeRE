package org.chromium.components.messages;

import J.N;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import defpackage.AD2;
import defpackage.AbstractC4144cD1;
import defpackage.AbstractC5266fV2;
import defpackage.C7272lK1;
import defpackage.DD2;
import defpackage.FD2;
import defpackage.GD2;
import defpackage.HU1;
import defpackage.HV1;
import defpackage.ID2;
import defpackage.InterfaceC0079Ap3;
import defpackage.LD2;
import defpackage.ND2;
import defpackage.PD2;
import defpackage.SC1;
import defpackage.ZC1;
import java.util.HashMap;
import org.chromium.base.Callback;
import org.chromium.components.messages.MessageWrapper;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class MessageWrapper implements SC1 {
    public long a;
    public final PropertyModel g;
    public HV1 h;

    public static MessageWrapper create(long j, int i) {
        return new MessageWrapper(i, j);
    }

    public MessageWrapper(int i, long j) {
        this.a = j;
        HashMap e = PropertyModel.e(HU1.F);
        ID2 id2 = HU1.a;
        DD2 dd2 = new DD2();
        dd2.a = i;
        e.put(id2, dd2);
        PD2 pd2 = HU1.d;
        InterfaceC0079Ap3 interfaceC0079Ap3 = new InterfaceC0079Ap3() { // from class: PV1
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                long j2 = MessageWrapper.this.a;
                if (j2 != 0) {
                    N.MVTCdx$k(j2);
                }
                return 1;
            }
        };
        GD2 gd2 = new GD2();
        gd2.a = interfaceC0079Ap3;
        e.put(pd2, gd2);
        PD2 pd22 = HU1.e;
        Runnable runnable = new Runnable() { // from class: QV1
            @Override // java.lang.Runnable
            public final void run() {
                long j2 = MessageWrapper.this.a;
                if (j2 == 0) {
                    return;
                }
                N.MoS27uC7(j2);
            }
        };
        GD2 gd22 = new GD2();
        gd22.a = runnable;
        e.put(pd22, gd22);
        PD2 pd23 = HU1.x;
        Callback callback = new Callback() { // from class: RV1
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                int intValue = ((Integer) obj).intValue();
                long j2 = MessageWrapper.this.a;
                if (j2 == 0) {
                    return;
                }
                N.M6PkOWjr(j2, intValue);
            }
        };
        GD2 gd23 = new GD2();
        gd23.a = callback;
        this.g = AbstractC5266fV2.a(e, pd23, gd23, e);
    }

    public String getTitle() {
        return (String) this.g.i(HU1.f);
    }

    public void setTitle(String str) {
        this.g.o(HU1.f, str);
    }

    public String getDescription() {
        CharSequence charSequence = (CharSequence) this.g.i(HU1.h);
        if (charSequence == null) {
            return null;
        }
        return charSequence.toString();
    }

    public void setDescription(CharSequence charSequence) {
        this.g.o(HU1.h, charSequence);
    }

    public int getDescriptionMaxLines() {
        return this.g.h(HU1.k);
    }

    public void setDescriptionMaxLines(int i) {
        this.g.m(HU1.k, i);
    }

    public String getPrimaryButtonText() {
        return (String) this.g.i(HU1.c);
    }

    public void setPrimaryButtonText(String str) {
        this.g.o(HU1.c, str);
    }

    public String getSecondaryButtonMenuText() {
        return (String) this.g.i(HU1.s);
    }

    public void setSecondaryButtonMenuText(String str) {
        this.g.o(HU1.s, str);
    }

    public void initializeSecondaryMenu(WindowAndroid windowAndroid, int i) {
        final Context context = (Context) windowAndroid.k().get();
        if (this.h != null) {
            PropertyModel propertyModel = this.g;
            propertyModel.m(HU1.v, i);
            propertyModel.o(HU1.u, new ZC1() { // from class: SV1
                @Override // defpackage.ZC1
                public final /* synthetic */ LI2 a(View view) {
                    return YC1.a(view);
                }

                @Override // defpackage.ZC1
                public final TC1 b() {
                    MessageWrapper messageWrapper = MessageWrapper.this;
                    return new C4738dx(context, messageWrapper.h.a, messageWrapper);
                }
            });
        }
    }

    public PropertyModel addSecondaryMenuItem(int i, int i2, String str) {
        if (this.h == null) {
            this.h = new HV1();
        }
        HV1 hv1 = this.h;
        hv1.getClass();
        HashMap e = PropertyModel.e(AbstractC4144cD1.j);
        ND2 nd2 = AbstractC4144cD1.e;
        DD2 dd2 = new DD2();
        dd2.a = i;
        e.put(nd2, dd2);
        ND2 nd22 = AbstractC4144cD1.c;
        DD2 dd22 = new DD2();
        dd22.a = i2;
        e.put(nd22, dd22);
        PD2 pd2 = AbstractC4144cD1.b;
        GD2 gd2 = new GD2();
        gd2.a = str;
        e.put(pd2, gd2);
        LD2 ld2 = AbstractC4144cD1.f;
        AD2 ad2 = new AD2();
        ad2.a = true;
        e.put(ld2, ad2);
        PropertyModel propertyModel = new PropertyModel(e);
        hv1.a.s(new C7272lK1(1, propertyModel));
        return propertyModel;
    }

    public void clearSecondaryMenuItems() {
        HV1 hv1 = this.h;
        if (hv1 == null) {
            return;
        }
        hv1.a.clear();
    }

    public void addSecondaryMenuItemDivider() {
        HV1 hv1 = this.h;
        if (hv1 == null) {
            return;
        }
        hv1.a.s(new C7272lK1(0, new PropertyModel(new FD2[0])));
    }

    public int getIconResourceId() {
        return this.g.h(HU1.m);
    }

    public void setIconResourceId(int i) {
        this.g.m(HU1.m, i);
    }

    public boolean isValidIcon() {
        return this.g.i(HU1.l) != null;
    }

    public void setIcon(Bitmap bitmap) {
        this.g.o(HU1.l, new BitmapDrawable(bitmap));
    }

    public void setLargeIcon(boolean z) {
        this.g.k(HU1.n, z);
    }

    public void setIconRoundedCornerRadius(int i) {
        this.g.m(HU1.o, i);
    }

    public void disableIconTint() {
        this.g.m(HU1.p, 0);
    }

    public int getSecondaryIconResourceId() {
        return this.g.h(HU1.r);
    }

    public void setSecondaryIconResourceId(int i) {
        this.g.m(HU1.r, i);
    }

    public void setDuration(long j) {
        this.g.n(HU1.w, j);
    }

    public void clearNativePtr() {
        this.a = 0L;
    }

    public Bitmap getIconBitmap() {
        return ((BitmapDrawable) ((Drawable) this.g.i(HU1.l))).getBitmap();
    }

    @Override // defpackage.SC1
    public final void b(PropertyModel propertyModel) {
        N.MSwKRLAp(this.a, propertyModel.h(AbstractC4144cD1.e));
    }
}
