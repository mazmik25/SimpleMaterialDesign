package azmimuhammad.com.materialdesign.custom;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import azmimuhammad.com.materialdesign.R;

/**
 * Created by mazmik25 on 2/28/2018.
 */

public class ContextualCallback implements ActionMode.Callback {
    @Override
    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        actionMode.getMenuInflater().inflate(R.menu.contextual_menu, menu);
        return true;
    }

    @Override
    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        actionMode.setTitle("Action Mode");
        actionMode.setSubtitle("by mazmik25");
        return false;
    }

    @Override
    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.save:
                break;
            default:
                break;

        }
        return false;
    }

    @Override
    public void onDestroyActionMode(ActionMode actionMode) {
        //when actionMode is completed
    }
}
