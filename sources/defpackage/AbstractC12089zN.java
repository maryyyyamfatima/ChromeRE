package defpackage;

import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.SuperscriptSpan;
import com.android.chrome.R;
import org.chromium.chrome.browser.flags.CachedFeatureFlags;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zN */
/* loaded from: classes.dex */
public abstract class AbstractC12089zN {
    public static final int[] a = {R.id.contextmenu_open_in_new_chrome_tab, R.id.contextmenu_open_in_chrome_incognito_tab, R.id.contextmenu_open_in_browser_id, R.id.contextmenu_open_in_new_tab, R.id.contextmenu_open_in_new_tab_in_group, R.id.contextmenu_open_in_incognito_tab, R.id.contextmenu_open_in_other_window, R.id.contextmenu_open_in_new_window, R.id.contextmenu_open_in_ephemeral_tab, R.id.contextmenu_copy_link_address, R.id.contextmenu_copy_link_text, R.id.contextmenu_save_link_as, R.id.contextmenu_share_link, R.id.contextmenu_direct_share_link, R.id.contextmenu_read_later, R.id.contextmenu_load_original_image, R.id.contextmenu_save_image, R.id.contextmenu_open_image, R.id.contextmenu_open_image_in_new_tab, R.id.contextmenu_open_image_in_ephemeral_tab, R.id.contextmenu_copy_image, R.id.contextmenu_search_by_image, R.id.contextmenu_search_with_google_lens, R.id.contextmenu_shop_image_with_google_lens, R.id.contextmenu_share_image, R.id.contextmenu_direct_share_image, R.id.contextmenu_call, R.id.contextmenu_send_message, R.id.contextmenu_add_to_contacts, R.id.contextmenu_copy, R.id.contextmenu_save_video, R.id.contextmenu_open_in_chrome, R.id.contextmenu_share_highlight, R.id.contextmenu_remove_highlight, R.id.contextmenu_learn_more};
    public static final int[] b = {R.string.0_resource_name_obfuscated_res_0x7f1403ab, R.string.0_resource_name_obfuscated_res_0x7f1403a8, 0, R.string.0_resource_name_obfuscated_res_0x7f1403ac, R.string.0_resource_name_obfuscated_res_0x7f1403ad, R.string.0_resource_name_obfuscated_res_0x7f1403aa, R.string.0_resource_name_obfuscated_res_0x7f1403af, R.string.0_resource_name_obfuscated_res_0x7f1403ae, R.string.0_resource_name_obfuscated_res_0x7f1403a9, R.string.0_resource_name_obfuscated_res_0x7f14039f, R.string.0_resource_name_obfuscated_res_0x7f1403a0, R.string.0_resource_name_obfuscated_res_0x7f1403b4, R.string.0_resource_name_obfuscated_res_0x7f1403bb, 0, R.string.0_resource_name_obfuscated_res_0x7f1403b1, R.string.0_resource_name_obfuscated_res_0x7f1403a4, R.string.0_resource_name_obfuscated_res_0x7f1403b3, R.string.0_resource_name_obfuscated_res_0x7f1403a5, R.string.0_resource_name_obfuscated_res_0x7f1403a7, R.string.0_resource_name_obfuscated_res_0x7f1403a6, R.string.0_resource_name_obfuscated_res_0x7f14039e, R.string.0_resource_name_obfuscated_res_0x7f1403b7, R.string.0_resource_name_obfuscated_res_0x7f1403b6, R.string.0_resource_name_obfuscated_res_0x7f1403bc, R.string.0_resource_name_obfuscated_res_0x7f1403ba, 0, R.string.0_resource_name_obfuscated_res_0x7f14039c, R.string.0_resource_name_obfuscated_res_0x7f1403b8, R.string.0_resource_name_obfuscated_res_0x7f14039b, R.string.0_resource_name_obfuscated_res_0x7f14039d, R.string.0_resource_name_obfuscated_res_0x7f1403b5, R.string.0_resource_name_obfuscated_res_0x7f140635, R.string.0_resource_name_obfuscated_res_0x7f1403b9, R.string.0_resource_name_obfuscated_res_0x7f1403b2, R.string.0_resource_name_obfuscated_res_0x7f1403a2};

    public static int b(Context context, int i) {
        if (AbstractC5177fD3.e(context)) {
            if (CachedFeatureFlags.b(AbstractC6265iP.d.b("TabGridLayoutAndroid:enable_tab_group_auto_creation"), true) && i == 3) {
                return R.string.0_resource_name_obfuscated_res_0x7f1403ad;
            }
        }
        return b[i];
    }

    public static CharSequence c(int i, Context context, boolean z) {
        if (i == 2) {
            return AbstractC6717jj0.a(false);
        }
        if (i == 8) {
            return a(i, context, "Chrome.Contextmenu.OpenInEphemeralTabClicked", z);
        }
        if (i == 14) {
            return a(i, context, null, z);
        }
        if (i != 19) {
            switch (i) {
                case 21:
                    return context.getString(b(context, i), IG3.a().c().c());
                case 22:
                    return a(i, context, "Chrome.ContextMenu.SearchWithGoogleLensClicked", z);
                case 23:
                    return a(i, context, "Chrome.ContextMenu.ShopImageWithGoogleLensClicked", z);
                default:
                    return context.getString(b(context, i));
            }
        }
        return a(i, context, "Chrome.Contextmenu.OpenImageInEphemeralTabClicked", z);
    }

    public static CharSequence a(int i, Context context, String str, boolean z) {
        String string = context.getString(b(context, i));
        return (!z || (str != null && O83.a.e(str, false))) ? AbstractC9108qg3.b(string, new C8765pg3(new Object[0])) : AbstractC9108qg3.a(string, new C8765pg3(new SuperscriptSpan(), new RelativeSizeSpan(0.75f), new ForegroundColorSpan(AbstractC10957w33.g(R.attr.0_resource_name_obfuscated_res_0x7f05013a, context))));
    }
}
