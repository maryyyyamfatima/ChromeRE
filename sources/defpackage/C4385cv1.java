package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import org.chromium.chrome.browser.autofill.PersonalDataManager;
import org.chromium.components.autofill.AutofillSuggestion;
import org.chromium.components.browser_ui.widget.chips.ChipView;
import org.chromium.ui.widget.ChromeImageView;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cv1 */
/* loaded from: classes.dex */
public final class C4385cv1 extends AbstractC9538rv1 {
    public final View z;

    @Override // defpackage.AbstractC9538rv1
    public final void v(C5416fv1 c5416fv1, View view) {
        final C5072ev1 c5072ev1 = (C5072ev1) c5416fv1;
        final ChipView chipView = (ChipView) view;
        AutofillSuggestion autofillSuggestion = c5072ev1.c;
        int i = autofillSuggestion.d;
        String str = c5072ev1.d;
        String str2 = autofillSuggestion.c;
        View view2 = this.z;
        if (str != null) {
            if (!str.equals("IPH_KeyboardAccessoryPaymentOffer")) {
                C3823bH3 a = AbstractC2181Qu1.a(c5072ev1.d, new ViewTreeObserverOnGlobalLayoutListenerC8754pe4(chipView), view2, null);
                if (a != null) {
                    chipView.setSelected(true);
                    a.a(new PopupWindow.OnDismissListener() { // from class: Pu1
                        @Override // android.widget.PopupWindow.OnDismissListener
                        public final void onDismiss() {
                            chipView.setSelected(false);
                        }
                    });
                    a.h();
                }
            } else if (i != 0) {
                C3823bH3 a2 = AbstractC2181Qu1.a(c5072ev1.d, new ViewTreeObserverOnGlobalLayoutListenerC8754pe4(chipView.h), view2, str2);
                if (a2 != null) {
                    a2.h();
                }
            } else {
                C3823bH3 a3 = AbstractC2181Qu1.a(c5072ev1.d, new ViewTreeObserverOnGlobalLayoutListenerC8754pe4(chipView), view2, str2);
                if (a3 != null) {
                    chipView.setSelected(true);
                    a3.a(new PopupWindow.OnDismissListener() { // from class: Pu1
                        @Override // android.widget.PopupWindow.OnDismissListener
                        public final void onDismiss() {
                            chipView.setSelected(false);
                        }
                    });
                    a3.h();
                }
            }
        }
        C10475ug c10475ug = chipView.g;
        String str3 = autofillSuggestion.a;
        c10475ug.setText(str3);
        C10475ug c10475ug2 = chipView.g;
        if (str2 == null || str2.isEmpty()) {
            c10475ug2.setContentDescription(str3);
        } else {
            c10475ug2.setContentDescription(str3 + " " + str2);
        }
        C10475ug a4 = chipView.a();
        String str4 = autofillSuggestion.b;
        a4.setText(str4);
        chipView.a().setVisibility(str4.isEmpty() ? 8 : 0);
        final C1142Iu1 c1142Iu1 = c5072ev1.b;
        chipView.setOnClickListener(new View.OnClickListener() { // from class: av1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                KU3 b;
                String str5 = C5072ev1.this.d;
                if (str5 != null && (b = AbstractC2181Qu1.b()) != null) {
                    char c = 65535;
                    switch (str5.hashCode()) {
                        case -2144335197:
                            if (str5.equals("IPH_KeyboardAccessoryPaymentOffer")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -1315293096:
                            if (str5.equals("IPH_KeyboardAccessoryAddressFilling")) {
                                c = 1;
                                break;
                            }
                            break;
                        case -273392465:
                            if (str5.equals("IPH_AutofillVirtualCardSuggestion")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 532938391:
                            if (str5.equals("IPH_KeyboardAccessoryPasswordFilling")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 1572211206:
                            if (str5.equals("IPH_KeyboardAccessoryPaymentFilling")) {
                                c = 4;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                        case 2:
                        case 4:
                            b.notifyEvent("autofill_virtual_card_suggestion_accepted");
                            break;
                        case 1:
                            b.notifyEvent("keyboard_accessory_address_suggestion_accepted");
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                            b.notifyEvent("keyboard_accessory_password_suggestion_accepted");
                            break;
                    }
                }
                C1142Iu1 c1142Iu12 = c1142Iu1;
                c1142Iu12.b.onResult(c1142Iu12);
            }
        });
        if (c1142Iu1.c != null) {
            chipView.setOnLongClickListener(new View.OnLongClickListener() { // from class: bv1
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view3) {
                    C1142Iu1 c1142Iu12 = C1142Iu1.this;
                    c1142Iu12.c.onResult(c1142Iu12);
                    return true;
                }
            });
        }
        GURL gurl = autofillSuggestion.k;
        Bitmap c = (gurl == null || !gurl.b) ? null : PersonalDataManager.d().c(gurl);
        if (c == null) {
            if (i == 0) {
                i = -1;
            }
            chipView.b(i, false);
        } else {
            BitmapDrawable bitmapDrawable = new BitmapDrawable(view2.getContext().getResources(), c);
            ChromeImageView chromeImageView = chipView.h;
            chromeImageView.setVisibility(0);
            chromeImageView.setImageDrawable(bitmapDrawable);
            c10475ug2.getTextColors();
            chromeImageView.setImageTintList(null);
        }
    }

    public C4385cv1(RecyclerView recyclerView) {
        super(R.layout.0_resource_name_obfuscated_res_0x7f0e0157, recyclerView);
        this.z = recyclerView.getRootView();
    }
}
