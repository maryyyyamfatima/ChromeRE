package defpackage;

import J.N;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.android.chrome.R;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.ChromeTabbedActivity;
import org.chromium.chrome.browser.app.bookmarks.BookmarkActivity;
import org.chromium.chrome.browser.app.bookmarks.BookmarkEditActivity;
import org.chromium.chrome.browser.bookmarks.BookmarkBridge;
import org.chromium.chrome.browser.document.ChromeLauncherActivity;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.bookmarks.BookmarkId;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.DeviceFormFactor;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class WA {
    public static BookmarkId d(C8938qA c8938qA) {
        Q83 q83 = O83.a;
        if (!q83.c("enhanced_bookmark_last_used_parent_folder")) {
            return null;
        }
        BookmarkId a = BookmarkId.a(q83.i("enhanced_bookmark_last_used_parent_folder", null));
        if (a.getType() != 2 || RH2.b()) {
            return a;
        }
        q83.t("enhanced_bookmark_last_used_parent_folder", c8938qA.i().toString());
        return null;
    }

    public static void g(Activity activity, QB qb, final boolean z, final BookmarkId bookmarkId, final boolean z2) {
        C3063Xo3 c3063Xo3;
        if (bookmarkId == null) {
            AbstractC4851eH1.a("BookmarkUtils", "Null bookmark found when showing the save flow, aborting.", new Object[0]);
            return;
        }
        if (V83.a()) {
            new C8372oY();
            c3063Xo3 = C8372oY.a().a;
        } else {
            c3063Xo3 = null;
        }
        final GA ga = new GA(activity, qb, c3063Xo3, new Q44(activity, new Handler()));
        ga.i.e(new Runnable() { // from class: BA
            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException
                */
            @Override // java.lang.Runnable
            public final void run() {
                /*
                    Method dump skipped, instructions count: 295
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.BA.run():void");
            }
        });
    }

    public static BookmarkId b(GURL gurl, String str, ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3, BookmarkBridge bookmarkBridge, Context context) {
        bookmarkBridge.getClass();
        Object obj = ThreadUtils.a;
        BookmarkId bookmarkId = (BookmarkId) N.MPWBoFyN(bookmarkBridge.c, bookmarkBridge, str, gurl);
        if (bookmarkId != null) {
            viewOnClickListenerC1069If3.c(C12188zf3.a(context.getString(R.string.0_resource_name_obfuscated_res_0x7f14093a), new UA(), 0, 37));
            LU3.a(Profile.d()).notifyEvent("read_later_article_saved");
        }
        return bookmarkId;
    }

    public static BookmarkId a(Activity activity, C8938qA c8938qA, String str, GURL gurl, WebContents webContents, BookmarkId bookmarkId, int i) {
        String str2;
        if (bookmarkId == null) {
            bookmarkId = d(c8938qA);
        }
        BookmarkBridge.BookmarkItem f = bookmarkId != null ? c8938qA.f(bookmarkId) : null;
        if (bookmarkId == null || f == null || f.g || !f.d) {
            bookmarkId = c8938qA.i();
        }
        if (!RH2.a() || (i != 2 && bookmarkId.getType() != 2)) {
            if (gurl.i().equals("chrome-native://newtab/")) {
                str = activity.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f1406cc);
            }
            BookmarkId a = c8938qA.a(webContents, bookmarkId, c8938qA.g(bookmarkId), str, gurl);
            if (a == null) {
                Object[] objArr = new Object[4];
                objArr[0] = bookmarkId;
                objArr[1] = c8938qA.i();
                objArr[2] = c8938qA.i();
                if (f == null) {
                    str2 = "null";
                } else {
                    str2 = f.a() + " " + f.g + " " + f.d;
                }
                objArr[3] = str2;
                AbstractC4851eH1.a("BookmarkUtils", "Failed to add bookmarks: parentTypeAndId %s, defaultFolderTypeAndId %s, mobileFolderTypeAndId %s, parentEditable Managed isFolder %s,", objArr);
                O83.a.t("enhanced_bookmark_last_used_parent_folder", c8938qA.i().toString());
            }
            return a;
        }
        Object obj = ThreadUtils.a;
        return (BookmarkId) N.MPWBoFyN(c8938qA.c, c8938qA, str, gurl);
    }

    public static void f(ChromeTabbedActivity chromeTabbedActivity, BookmarkId bookmarkId, boolean z) {
        String uri;
        Object obj = ThreadUtils.a;
        Context context = chromeTabbedActivity == null ? V60.a : chromeTabbedActivity;
        if (bookmarkId != null) {
            Uri.Builder buildUpon = Uri.parse("chrome-native://bookmarks/folder/").buildUpon();
            buildUpon.appendPath(bookmarkId.toString());
            uri = buildUpon.build().toString();
        } else {
            uri = O83.a.i("enhanced_bookmark_last_used_url", "chrome-native://bookmarks/");
        }
        String str = TextUtils.isEmpty(uri) ? "chrome-native://bookmarks/" : uri;
        if (RH2.c() && O83.a.c("enhanced_bookmark_last_used_url")) {
            FI2.a("MobileBookmarkManagerReopenBookmarksInSameSession");
        }
        if (DeviceFormFactor.a(context)) {
            e(context, str, chromeTabbedActivity == null ? null : chromeTabbedActivity.getComponentName(), null, z);
            return;
        }
        Intent intent = new Intent(context, (Class<?>) BookmarkActivity.class);
        intent.putExtra("org.chromium.chrome.browser.incognito_mode", z);
        intent.setData(Uri.parse(str));
        if (chromeTabbedActivity != null) {
            intent.putExtra("org.chromium.chrome.browser.parent_component", chromeTabbedActivity.getComponentName());
            chromeTabbedActivity.startActivity(intent);
        } else {
            intent.addFlags(268435456);
            C1761No1.y(null, intent, null);
        }
    }

    public static void h(Context context, BookmarkId bookmarkId) {
        FI2.a("MobileBookmarkManagerEditBookmark");
        Intent intent = new Intent(context, (Class<?>) BookmarkEditActivity.class);
        intent.putExtra("BookmarkEditActivity.BookmarkId", bookmarkId.toString());
        if (context instanceof BookmarkActivity) {
            ((BookmarkActivity) context).startActivityForResult(intent, 14);
        } else {
            context.startActivity(intent);
        }
    }

    public static Drawable c(Context context, int i) {
        int i2 = R.color.0_resource_name_obfuscated_res_0x7f070113;
        if (i == 2) {
            if (i != 2) {
                i2 = R.color.0_resource_name_obfuscated_res_0x7f07012b;
            }
            return AbstractC8540p04.e(R.drawable.0_resource_name_obfuscated_res_0x7f09030c, i2, context);
        }
        if (i != 2) {
            i2 = R.color.0_resource_name_obfuscated_res_0x7f07012b;
        }
        return AbstractC8540p04.e(R.drawable.0_resource_name_obfuscated_res_0x7f09020e, i2, context);
    }

    public static void e(Context context, String str, ComponentName componentName, Integer num, boolean z) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.putExtra("com.android.browser.application_id", context.getApplicationContext().getPackageName());
        intent.setFlags(268435456);
        intent.putExtra("com.google.chrome.transition_type", 2);
        if (num == null) {
            intent.putExtra("org.chromium.chrome.browser.incognito_mode", z);
        } else {
            intent.putExtra("org.chromium.chrome.browser.tab_launch_type", num.intValue());
            if (z) {
                intent.putExtra("com.google.android.apps.chrome.EXTRA_OPEN_NEW_INCOGNITO_TAB", true);
            } else {
                intent.putExtra("create_new_tab", true);
            }
        }
        if (componentName != null) {
            AbstractC9942t6.c(intent, componentName);
        } else {
            intent.setClass(context.getApplicationContext(), ChromeLauncherActivity.class);
        }
        C1761No1.y(null, intent, null);
    }
}
