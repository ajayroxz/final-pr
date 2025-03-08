public class tictactoe{
    char[][] board;
    public tictactoe(){
        board=new char[3][3]; 
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                board[i][j]=' ';
            }
        }          
    }
    void display(){
        System.out.println("---------------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++)
            {
                System.out.print("| "+ board[i][j]+" ");
            }
            System.out.println(" |");
            System.out.println("---------------");
        }
    }
    void checkwin(){
        if(board[0][0]!=' '&& board[0][0]==board[1][0] && board[1][0]==board[2][0] ||//verti 1
        board[0][1]!=' '&&board[0][1]==board[1][1] &&board[1][1]==board[2][1]  || //verti 2
        board[0][2]!=' '&&board[0][2]==board[1][2] && board[1][2] == board[2][2] || // verti3
        board[0][0]!=' '&&board [0][0]==board[1][1] && board[1][1] ==board[2][2] || // diag 1 
        board[0][2]!=' '&&board[0][2]==board[1][1] && board[1][1] ==board[2][0]|| 
        board[0][0] !=' '&& board[0][0] ==board[0][1] && board[0][1] ==board[0][2]|| 
        board[1][0]!=' '&& board[1][0]==board[1][1] && board[1][1]==board[1][2]||
        board[2][0]!=' '&& board[2][0]==board[2][1]&& board[2][1] ==board[2][2])
          //diag 2
        { 
            System.out.println("you win");
        }
        else{
            System.out.println("no,try again");
        }
        display();
    }
    void mark(int a,int b,char c){
        board[a][b]=c;
    }
    public static void main(String[] args) {
        tictactoe ref=new tictactoe();
        System.out.println("starting board:");
        ref.mark(0, 0, 'x');
        ref.mark(1, 0, 'x');
        ref.mark(2, 0, 'x');
       ref.mark(1, 0, 'o');
       ref.mark(1, 1, 'o');
       ref.mark(1, 2, 'x');
       ref.mark(0, 1, 'o');
       ref.mark(2, 1, 'x');
       ref.mark(2, 2, 'x');
       ref.checkwin();


    }
    
}
