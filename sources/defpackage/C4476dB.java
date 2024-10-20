package defpackage;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import com.android.chrome.R;
import com.google.android.apps.chrome.appwidget.bookmarks.BookmarkThumbnailWidgetProvider;
import java.util.concurrent.LinkedBlockingQueue;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.bookmarks.BookmarkId;
import org.chromium.components.favicon.LargeIconBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4476dB implements RemoteViewsService.RemoteViewsFactory, InterfaceC0494Du3 {
    public final Context a;
    public final int g;
    public final SharedPreferences h;
    public int i;
    public C8938qA j;
    public C4819eB k;

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getViewTypeCount() {
        return 2;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final boolean hasStableIds() {
        return false;
    }

    public C4476dB(AbstractC1469Lh3 abstractC1469Lh3, int i) {
        this.a = abstractC1469Lh3;
        this.g = i;
        this.h = C6537jB.b(i);
        this.i = abstractC1469Lh3.getColor(R.color.f17720_resource_name_obfuscated_res_0x7f070114);
        C0624Eu3.a().a.a(this);
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onCreate() {
        C7629mN.a().d(false);
        if (this.h.getString("bookmarkswidget.current_folder", null) == null) {
            FI2.a("BookmarkNavigatorWidgetAdded");
        }
        C8938qA c8938qA = new C8938qA();
        this.j = c8938qA;
        c8938qA.b(new C3789bB(this));
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
        PostTask.d(AbstractC5103f04.a, new Runnable() { // from class: aB
            @Override // java.lang.Runnable
            public final void run() {
                C4476dB c4476dB = C4476dB.this;
                C8938qA c8938qA = c4476dB.j;
                if (c8938qA != null) {
                    c8938qA.c();
                }
                C0624Eu3.a().a.d(c4476dB);
            }
        });
        C6537jB.a(this.g);
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDataSetChanged() {
        SharedPreferences sharedPreferences = this.h;
        C4819eB c4819eB = null;
        final BookmarkId a = BookmarkId.a(sharedPreferences.getString("bookmarkswidget.current_folder", null));
        final LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(1);
        final C6195iB c6195iB = new C6195iB();
        PostTask.d(AbstractC5103f04.a, new Runnable() { // from class: ZA
            @Override // java.lang.Runnable
            public final void run() {
                C4476dB c4476dB = C4476dB.this;
                c4476dB.getClass();
                C4132cB c4132cB = new C4132cB(linkedBlockingQueue);
                C6195iB c6195iB2 = c6195iB;
                c6195iB2.a = c4132cB;
                Context context = c4476dB.a;
                Resources resources = context.getResources();
                c6195iB2.d = new LargeIconBridge(Profile.d());
                c6195iB2.f = (int) resources.getDimension(R.dimen.f30470_resource_name_obfuscated_res_0x7f080179);
                c6195iB2.g = resources.getDimensionPixelSize(R.dimen.f30480_resource_name_obfuscated_res_0x7f08017a);
                c6195iB2.e = AbstractC4855eI0.c(context);
                c6195iB2.h = 1;
                C8938qA c8938qA = new C8938qA();
                c6195iB2.c = c8938qA;
                c8938qA.e(new RunnableC5163fB(c6195iB2, a));
            }
        });
        try {
            c4819eB = (C4819eB) linkedBlockingQueue.take();
        } catch (InterruptedException unused) {
        }
        this.k = c4819eB;
        sharedPreferences.edit().putString("bookmarkswidget.current_folder", this.k.a.c.toString()).apply();
    }

    public final XA b(int i) {
        C4819eB c4819eB = this.k;
        if (c4819eB == null) {
            return null;
        }
        if (c4819eB.b != null) {
            if (i == 0) {
                return c4819eB.a;
            }
            i--;
        }
        if (c4819eB.c.size() <= i) {
            return null;
        }
        return (XA) this.k.c.get(i);
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getCount() {
        if (this.k == null || !this.h.getString("bookmarkswidget.current_folder", "").equals(this.k.a.c.toString())) {
            PostTask.d(AbstractC5103f04.a, new Runnable() { // from class: YA
                @Override // java.lang.Runnable
                public final void run() {
                    C4476dB c4476dB = C4476dB.this;
                    c4476dB.getClass();
                    Context context = c4476dB.a;
                    context.sendBroadcast(new Intent(BookmarkThumbnailWidgetProvider.a(context), null, context, BookmarkThumbnailWidgetProvider.class).putExtra("appWidgetId", c4476dB.g));
                }
            });
        }
        C4819eB c4819eB = this.k;
        if (c4819eB == null) {
            return 0;
        }
        return c4819eB.c.size() + (this.k.b != null ? 1 : 0);
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final long getItemId(int i) {
        XA b = b(i);
        if (b == null) {
            return -2L;
        }
        return b.c.getId();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getLoadingView() {
        return new RemoteViews(this.a.getPackageName(), R.layout.f56200_resource_name_obfuscated_res_0x7f0e006c);
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getViewAt(int i) {
        Intent addCategory;
        if (this.k == null) {
            AbstractC4851eH1.f("BookmarkWidget", "No current folder data available.", new Object[0]);
            return null;
        }
        XA b = b(i);
        if (b == null) {
            AbstractC4851eH1.f("BookmarkWidget", "Couldn't get bookmark for position %d", Integer.valueOf(i));
            return null;
        }
        String str = b.a;
        String i2 = b.b.i();
        C4819eB c4819eB = this.k;
        BookmarkId bookmarkId = b == c4819eB.a ? c4819eB.b.c : b.c;
        RemoteViews remoteViews = new RemoteViews(this.a.getPackageName(), R.layout.f56200_resource_name_obfuscated_res_0x7f0e006c);
        if (TextUtils.isEmpty(str)) {
            str = i2;
        }
        remoteViews.setTextViewText(R.id.title, str);
        if (b == this.k.a) {
            remoteViews.setInt(R.id.favicon, "setColorFilter", this.i);
            remoteViews.setImageViewResource(R.id.favicon, R.drawable.f46950_resource_name_obfuscated_res_0x7f0901bf);
        } else if (b.e) {
            remoteViews.setInt(R.id.favicon, "setColorFilter", this.i);
            remoteViews.setImageViewResource(R.id.favicon, R.drawable.f47690_resource_name_obfuscated_res_0x7f09020e);
        } else {
            remoteViews.setInt(R.id.favicon, "setColorFilter", 0);
            remoteViews.setImageViewBitmap(R.id.favicon, b.f);
        }
        if (b.e) {
            addCategory = new Intent(V60.a.getPackageName() + ".CHANGE_FOLDER").putExtra("appWidgetId", this.g).putExtra("folderId", bookmarkId.toString());
        } else {
            Intent intent = new Intent("android.intent.action.VIEW");
            if (!TextUtils.isEmpty(i2)) {
                addCategory = intent.addCategory("android.intent.category.BROWSABLE").setData(Uri.parse(i2));
            } else {
                addCategory = intent.addCategory("android.intent.category.LAUNCHER");
            }
        }
        remoteViews.setOnClickFillInIntent(R.id.list_item, addCategory);
        return remoteViews;
    }

    @Override // defpackage.InterfaceC0494Du3
    public final void a() {
        this.i = this.a.getColor(R.color.f17720_resource_name_obfuscated_res_0x7f070114);
        AppWidgetManager.getInstance(V60.a).notifyAppWidgetViewDataChanged(this.g, R.id.bookmarks_list);
    }
}
