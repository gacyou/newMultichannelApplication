package com.newmultichannel.app.Common;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;

import com.newmultichannel.app.Activity.LattleToolActivity;
import com.newmultichannel.app.constant.ExtraKey;

public class CommonIntent {

    public static Intent createLattleToolActivity(@NonNull Context context, @NonNull String string) {
        Intent intent = new Intent(context, LattleToolActivity.class);
        intent.putExtra(ExtraKey.ID, string);

        return intent;
    }
}
