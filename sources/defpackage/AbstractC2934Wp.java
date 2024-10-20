package defpackage;

import J.N;
import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.app.ChromeActivity;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.components.autofill_assistant.Starter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Wp */
/* loaded from: classes.dex */
public abstract class AbstractC2934Wp {
    /* JADX WARN: Type inference failed for: r0v27, types: [Tp] */
    public static void b(Activity activity, final C6309iX3 c6309iX3) {
        String str;
        if (activity instanceof ChromeActivity) {
            String d = c6309iX3.d("INTENT");
            if (d != null) {
                char c = 65535;
                switch (d.hashCode()) {
                    case -2088597562:
                        if (d.equals("SHOPPING_ASSISTED_CHECKOUT")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1625207450:
                        if (d.equals("FOOD_ORDERING_PICKUP")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1189328802:
                        if (d.equals("FOOD_ORDERING_DELIVERY")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1012005455:
                        if (d.equals("FLIGHTS_CHECKIN")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -704774060:
                        if (d.equals("BUY_MOVIE_TICKET")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -577575125:
                        if (d.equals("TELEPORT")) {
                            c = 5;
                            break;
                        }
                        break;
                    case -346534763:
                        if (d.equals("FOOD_ORDERING")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 303317422:
                        if (d.equals("RENT_CAR")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 438165864:
                        if (d.equals("SHOPPING")) {
                            c = '\b';
                            break;
                        }
                        break;
                    case 1793934804:
                        if (d.equals("PASSWORD_CHANGE")) {
                            c = '\t';
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        str = "ShoppingAssistedCheckout";
                        break;
                    case 1:
                        str = "FoodOrderingPickup";
                        break;
                    case 2:
                        str = "FoodOrderingDelivery";
                        break;
                    case ModuleDescriptor.MODULE_VERSION /* 3 */:
                        str = "FlightsCheckin";
                        break;
                    case 4:
                        str = "BuyMovieTicket";
                        break;
                    case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                        str = "Teleport";
                        break;
                    case 6:
                        str = "FoodOrdering";
                        break;
                    case 7:
                        str = "RentCar";
                        break;
                    case '\b':
                        str = "Shopping";
                        break;
                    case '\t':
                        str = "PasswordChange";
                        break;
                    default:
                        str = "UnknownIntent";
                        break;
                }
            } else {
                str = "NotSet";
            }
            EI2.h(0, 29, "Android.AutofillAssistant.DropOutReason.".concat(str));
            EI2.h(0, 29, "Android.AutofillAssistant.DropOutReason");
            ChromeActivity chromeActivity = (ChromeActivity) activity;
            ?? r0 = new Callback() { // from class: Tp
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    ((Starter) ((Tab) obj).F().b(Starter.class)).b(C6309iX3.this);
                }
            };
            if (chromeActivity.g1() != null) {
                r0.onResult(chromeActivity.g1());
            } else {
                chromeActivity.A0.m(new C2804Vp(chromeActivity, r0));
            }
        }
    }

    public static boolean a(Intent intent) {
        boolean booleanValue;
        if (!N.MRiRQ_Ey(N.MffiISNV(0))) {
            return false;
        }
        C5965hX3 e = C6309iX3.e();
        e.b(intent.getExtras());
        Object obj = e.a.a.get("ENABLED");
        if (obj instanceof Boolean) {
            booleanValue = ((Boolean) obj).booleanValue();
        } else {
            if (obj != null) {
                obj.toString();
            }
            booleanValue = false;
        }
        return booleanValue;
    }
}
