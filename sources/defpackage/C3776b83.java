package defpackage;

import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: b83 */
/* loaded from: classes.dex */
public final class C3776b83 {
    public static final /* synthetic */ int d = 0;
    public final QB a;
    public final PackageManager b;
    public final Profile c;

    static {
        new HashSet(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7));
        new ArrayList(Arrays.asList("com.whatsapp.ContactPicker", "com.facebook.composer.shareintent.ImplicitShareIntentHandlerDefaultAlias", "com.google.android.gm.ComposeActivityGmailExternal", "com.instagram.share.handleractivity.StoryShareHandlerActivity", "com.facebook.messenger.intents.ShareIntentHandler", "com.google.android.apps.messaging.ui.conversationlist.ShareIntentActivity", "com.twitter.composer.ComposerActivity", "com.snap.mushroom.MainActivity", "com.pinterest.activity.create.PinItActivity", "com.linkedin.android.publishing.sharing.LinkedInDeepLinkActivity", "jp.naver.line.android.activity.selectchat.SelectChatActivityLaunchActivity", "com.facebook.lite.composer.activities.ShareIntentMultiPhotoAlphabeticalAlias", "com.facebook.mlite.share.view.ShareActivity", "com.samsung.android.email.ui.messageview.MessageFileView", "com.yahoo.mail.ui.activities.ComposeActivity", "org.telegram.ui.LaunchActivity", "com.tencent.mm.ui.tools.ShareImgUI"));
    }

    public C3776b83(QB qb, PackageManager packageManager, Profile profile) {
        this.a = qb;
        this.b = packageManager;
        this.c = profile;
    }

    public static PropertyModel a(Drawable drawable, String str, String str2, View.OnClickListener onClickListener, boolean z) {
        HashMap e = PropertyModel.e(Q73.f);
        PD2 pd2 = Q73.a;
        GD2 gd2 = new GD2();
        gd2.a = drawable;
        e.put(pd2, gd2);
        PD2 pd22 = Q73.b;
        GD2 gd22 = new GD2();
        gd22.a = str;
        e.put(pd22, gd22);
        PD2 pd23 = Q73.d;
        GD2 gd23 = new GD2();
        gd23.a = onClickListener;
        e.put(pd23, gd23);
        LD2 ld2 = Q73.e;
        AD2 ad2 = new AD2();
        ad2.a = z;
        e.put(ld2, ad2);
        if (str2 != null) {
            PD2 pd24 = Q73.c;
            GD2 gd24 = new GD2();
            gd24.a = str2;
            e.put(pd24, gd24);
        }
        return new PropertyModel(e);
    }
}
