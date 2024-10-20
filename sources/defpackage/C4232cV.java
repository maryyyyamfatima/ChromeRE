package defpackage;

import J.N;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.android.chrome.R;
import java.util.Arrays;
import org.chromium.components.omnibox.AutocompleteMatch;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cV */
/* loaded from: classes.dex */
public final class C4232cV extends AbstractC12286zw {
    @Override // defpackage.InterfaceC7471lu0
    public final int f() {
        return 5;
    }

    public C4232cV(Context context, C1245Jp c1245Jp, TH0 th0) {
        super(context, c1245Jp, th0);
    }

    @Override // defpackage.InterfaceC7471lu0
    public final PropertyModel g() {
        return new PropertyModel(AbstractC8132np3.e);
    }

    @Override // defpackage.AbstractC12286zw, defpackage.InterfaceC7444lp3
    public final void b(int i, AutocompleteMatch autocompleteMatch, PropertyModel propertyModel) {
        super.b(i, autocompleteMatch, propertyModel);
        propertyModel.k(AbstractC8132np3.a, !(autocompleteMatch.a == 19));
        propertyModel.o(AbstractC8132np3.b, new C7788mp3(autocompleteMatch.f));
        n(autocompleteMatch, propertyModel, false);
    }

    @Override // defpackage.InterfaceC7444lp3
    public final boolean c(AutocompleteMatch autocompleteMatch, int i) {
        int i2 = autocompleteMatch.a;
        return i2 == 19 || i2 == 26 || i2 == 27;
    }

    public final void n(final AutocompleteMatch autocompleteMatch, final PropertyModel propertyModel, boolean z) {
        Runnable runnable;
        byte[] bArr;
        Bitmap decodeByteArray;
        propertyModel.o(AbstractC8132np3.c, new C7788mp3(z ? autocompleteMatch.d : ""));
        boolean z2 = autocompleteMatch.a == 19;
        int i = z2 ? R.drawable.0_resource_name_obfuscated_res_0x7f090212 : R.drawable.0_resource_name_obfuscated_res_0x7f090325;
        Context context = this.a;
        C5382fp3 c = C5382fp3.c(context, i);
        c.b = true;
        AbstractC12286zw.k(propertyModel, c.a());
        if (z) {
            if (autocompleteMatch.a == 27 && (bArr = autocompleteMatch.t) != null && bArr.length > 0 && (decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length)) != null) {
                if (decodeByteArray.getWidth() > 0 && decodeByteArray.getHeight() > 0) {
                    int width = decodeByteArray.getWidth();
                    int i2 = this.d;
                    if (width > i2 || decodeByteArray.getHeight() > i2) {
                        float max = i2 / Math.max(decodeByteArray.getWidth(), decodeByteArray.getHeight());
                        decodeByteArray = Bitmap.createScaledBitmap(decodeByteArray, Math.round(decodeByteArray.getWidth() * max), Math.round(max * decodeByteArray.getHeight()), true);
                    }
                }
                C5382fp3 b = C5382fp3.b(context, decodeByteArray);
                b.c = true;
                b.d = true;
                AbstractC12286zw.k(propertyModel, b.a());
            } else if (z2) {
                this.c.b(autocompleteMatch.j, false, new C11943yw(this, propertyModel));
            }
        }
        int i3 = z ? R.drawable.0_resource_name_obfuscated_res_0x7f090338 : R.drawable.0_resource_name_obfuscated_res_0x7f090337;
        String string = context.getResources().getString(z ? R.string.0_resource_name_obfuscated_res_0x7f14014d : R.string.0_resource_name_obfuscated_res_0x7f140152);
        String string2 = context.getResources().getString(z ? R.string.0_resource_name_obfuscated_res_0x7f14014c : R.string.0_resource_name_obfuscated_res_0x7f140151);
        if (z) {
            runnable = new Runnable() { // from class: YU
                @Override // java.lang.Runnable
                public final void run() {
                    C4232cV c4232cV = C4232cV.this;
                    c4232cV.getClass();
                    FI2.a("Omnibox.ClipboardSuggestion.Conceal");
                    c4232cV.n(autocompleteMatch, propertyModel, false);
                }
            };
        } else {
            runnable = new Runnable() { // from class: ZU
                @Override // java.lang.Runnable
                public final void run() {
                    final C4232cV c4232cV = C4232cV.this;
                    c4232cV.getClass();
                    FI2.a("Omnibox.ClipboardSuggestion.Reveal");
                    final AutocompleteMatch autocompleteMatch2 = autocompleteMatch;
                    boolean k = autocompleteMatch2.j.k();
                    final PropertyModel propertyModel2 = propertyModel;
                    if (k) {
                        Runnable runnable2 = new Runnable() { // from class: bV
                            @Override // java.lang.Runnable
                            public final void run() {
                                C4232cV.this.n(autocompleteMatch2, propertyModel2, true);
                            }
                        };
                        long j = autocompleteMatch2.w;
                        if (j == 0) {
                            runnable2.run();
                            return;
                        } else {
                            N.MrcKeMB9(j, runnable2);
                            return;
                        }
                    }
                    c4232cV.n(autocompleteMatch2, propertyModel2, true);
                }
            };
        }
        C5382fp3 c2 = C5382fp3.c(context, i3);
        c2.d = true;
        c2.b = true;
        propertyModel.o(AbstractC0240Bw.b, Arrays.asList(new C0110Aw(c2.a(), string, string2, runnable)));
    }

    @Override // defpackage.AbstractC12286zw
    public final void j(final AutocompleteMatch autocompleteMatch, final int i) {
        if (!autocompleteMatch.j.k()) {
            super.j(autocompleteMatch, i);
            return;
        }
        Runnable runnable = new Runnable() { // from class: aV
            @Override // java.lang.Runnable
            public final void run() {
                super/*zw*/.j(autocompleteMatch, i);
            }
        };
        long j = autocompleteMatch.w;
        if (j == 0) {
            runnable.run();
        } else {
            N.MrcKeMB9(j, runnable);
        }
    }
}
